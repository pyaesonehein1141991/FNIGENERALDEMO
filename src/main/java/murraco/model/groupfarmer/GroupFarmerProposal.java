package murraco.model.groupfarmer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import murraco.model.common.CommonCreateAndUpateMarks;
import murraco.model.common.ProposalType;
import murraco.model.commonentity.PaymentType;
import murraco.model.commonentity.SaleMan;
import murraco.model.customer.Customer;

@Entity
@Table(name = "GROUPFARMERPROPOSAL")
public class GroupFarmerProposal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Transient
	private String prefix;

	private String proposalNo;

	@Temporal(TemporalType.DATE)
	private Date submittedDate;

	@Enumerated(EnumType.STRING)
	private ProposalType proposalType;

	@Temporal(TemporalType.DATE)
	private Date endDate;

	private int noOfInsuredPerson;

	private double totalSI;

	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "BRANCHID", referencedColumnName = "ID") private
	 * Branch branch;
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAYMENTTYPEID", referencedColumnName = "ID")
	private PaymentType paymentType;

	/*
	 * @OneToOne(fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "AGENTID", referencedColumnName = "ID") private Agent
	 * agent;
	 */

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SALEMANID", referencedColumnName = "ID")
	private SaleMan saleMan;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REFERRALID", referencedColumnName = "ID")
	private Customer referral;

	//TODO FIXME PSH
	/*
	 * @OneToOne(fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "ORGANIZATIONID", referencedColumnName = "ID") private
	 * Organization organization;
	 */

	//TODO FIXME PSH
	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy =
	 * "groupFarmerProposal", orphanRemoval = true) private
	 * List<GroupFarmerProposalAttachment> attachmentList;
	 */

	private double premium;

	private boolean isPaymentComplete;

	private boolean isProcessComplete;

	@Transient
	private boolean isShowIssue;

	//TODO FIXME PSH
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "SALEPOINTID") private SalePoint salePoint;
	 */
	@Embedded
	private CommonCreateAndUpateMarks commonCreateAndUpateMarks;

	@Version
	private int version;

	public GroupFarmerProposal() {

	}

	//TODO FIXME PSH
	/*
	 * public GroupFarmerProposal(GroupFarmerProposalDTO groupFarmerProposal) {
	 * this.id = groupFarmerProposal.getId(); this.proposalNo =
	 * groupFarmerProposal.getProposalNo(); this.submittedDate =
	 * groupFarmerProposal.getSubmittedDate(); this.endDate =
	 * groupFarmerProposal.getEndDate(); this.noOfInsuredPerson =
	 * groupFarmerProposal.getNoOfInsuredPerson(); this.branch =
	 * groupFarmerProposal.getBranch(); this.salePoint =
	 * groupFarmerProposal.getSalePoint(); this.totalSI =
	 * groupFarmerProposal.getTotalSI(); this.saleMan =
	 * groupFarmerProposal.getSaleMan(); this.agent =
	 * groupFarmerProposal.getAgent(); this.referral =
	 * groupFarmerProposal.getReferral(); this.salePoint =
	 * groupFarmerProposal.getSalePoint(); this.premium =
	 * groupFarmerProposal.getPremium(); this.paymentType =
	 * groupFarmerProposal.getPaymentType(); this.proposalType =
	 * groupFarmerProposal.getProposalType(); this.organization =
	 * groupFarmerProposal.getOrganization(); this.version =
	 * groupFarmerProposal.getVersion(); this.attachmentList =
	 * groupFarmerProposal.getAttachMentList();
	 * 
	 * }
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getNoOfInsuredPerson() {
		return noOfInsuredPerson;
	}

	public void setNoOfInsuredPerson(int noOfInsuredPerson) {
		this.noOfInsuredPerson = noOfInsuredPerson;
	}

	public double getTotalSI() {
		return totalSI;
	}

	public void setTotalSI(double totalSI) {
		this.totalSI = totalSI;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/*
	 * public Agent getAgent() { return agent; }
	 * 
	 * public void setAgent(Agent agent) { this.agent = agent; }
	 */

	public SaleMan getSaleMan() {
		return saleMan;
	}

	public void setSaleMan(SaleMan saleMan) {
		this.saleMan = saleMan;
	}

	public Customer getReferral() {
		return referral;
	}

	public void setReferral(Customer referral) {
		this.referral = referral;
	}

	//TODO FIXME PSH
	/*
	 * public List<GroupFarmerProposalAttachment> getAttachmentList() { if
	 * (this.attachmentList == null) { this.attachmentList = new
	 * ArrayList<GroupFarmerProposalAttachment>(); } return attachmentList; }
	 */

	//TODO FIXME PSH
	/*
	 * public void setAttachmentList(List<GroupFarmerProposalAttachment>
	 * attachmentList) { if (attachmentList != null) { for
	 * (GroupFarmerProposalAttachment attachment : attachmentList) {
	 * addAttachment(attachment); } } this.attachmentList = attachmentList; }
	 */
	public CommonCreateAndUpateMarks getCommonCreateAndUpateMarks() {
		return commonCreateAndUpateMarks;
	}

	public void setCommonCreateAndUpateMarks(CommonCreateAndUpateMarks commonCreateAndUpateMarks) {
		this.commonCreateAndUpateMarks = commonCreateAndUpateMarks;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public ProposalType getProposalType() {
		return proposalType;
	}

	public void setProposalType(ProposalType proposalType) {
		this.proposalType = proposalType;
	}

	//TODO FIXME PSH
	/*
	 * public String getSalePersonName() { if (agent != null) { return
	 * agent.getFullName(); } else if (saleMan != null) { return
	 * saleMan.getFullName(); } else if (referral != null) { return
	 * referral.getFullName(); } return null; }
	 */

	public boolean isPaymentComplete() {
		return isPaymentComplete;
	}

	public void setPaymentComplete(boolean isPaymentComplete) {
		this.isPaymentComplete = isPaymentComplete;
	}

	//TODO FIXME PSH
	/*
	 * public SalePoint getSalePoint() { return salePoint; }
	 * 
	 * public void setSalePoint(SalePoint salePoint) { this.salePoint =
	 * salePoint; }
	 */
	/*
	 * public Branch getBranch() { return branch; }
	 * 
	 * public void setBranch(Branch branch) { this.branch = branch; }
	 */

	public boolean isProcessComplete() {
		return isProcessComplete;
	}

	public void setProcessComplete(boolean isProcessComplete) {
		this.isProcessComplete = isProcessComplete;
	}

	//TODO FIXME PSH
	/*
	 * public void addAttachment(GroupFarmerProposalAttachment attachment) { if
	 * (attachmentList == null) { attachmentList = new
	 * ArrayList<GroupFarmerProposalAttachment>(); }
	 * attachment.setGroupFarmerProposal(this); attachmentList.add(attachment);
	 * }
	 */
	
	//TODO FIXME PSH
	/*
	 * public Organization getOrganization() { return organization; }
	 * 
	 * public void setOrganization(Organization organization) {
	 * this.organization = organization; }
	 */
	public boolean isShowIssue() {
		return isShowIssue;
	}

	public void setShowIssue(boolean isShowIssue) {
		this.isShowIssue = isShowIssue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
//		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((commonCreateAndUpateMarks == null) ? 0 : commonCreateAndUpateMarks.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isPaymentComplete ? 1231 : 1237);
		result = prime * result + (isProcessComplete ? 1231 : 1237);
		result = prime * result + (isShowIssue ? 1231 : 1237);
		result = prime * result + noOfInsuredPerson;
		//TODO FIXME PSH
//		result = prime * result + ((organization == null) ? 0 : organization.hashCode());
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
		long temp;
		temp = Double.doubleToLongBits(premium);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((proposalNo == null) ? 0 : proposalNo.hashCode());
		result = prime * result + ((proposalType == null) ? 0 : proposalType.hashCode());
		result = prime * result + ((referral == null) ? 0 : referral.hashCode());
		result = prime * result + ((saleMan == null) ? 0 : saleMan.hashCode());
//		result = prime * result + ((salePoint == null) ? 0 : salePoint.hashCode());
		result = prime * result + ((submittedDate == null) ? 0 : submittedDate.hashCode());
		temp = Double.doubleToLongBits(totalSI);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupFarmerProposal other = (GroupFarmerProposal) obj;
		/*
		 * if (agent == null) { if (other.agent != null) return false; } else if
		 * (!agent.equals(other.agent)) return false;
		 */
		/*
		 * if (branch == null) { if (other.branch != null) return false; } else
		 * if (!branch.equals(other.branch)) return false;
		 */
		if (commonCreateAndUpateMarks == null) {
			if (other.commonCreateAndUpateMarks != null)
				return false;
		} else if (!commonCreateAndUpateMarks.equals(other.commonCreateAndUpateMarks))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isPaymentComplete != other.isPaymentComplete)
			return false;
		if (isProcessComplete != other.isProcessComplete)
			return false;
		if (isShowIssue != other.isShowIssue)
			return false;
		if (noOfInsuredPerson != other.noOfInsuredPerson)
			return false;
//		TODO FIXME PSH
		/*
		 * if (organization == null) { if (other.organization != null) return
		 * false; } else if (!organization.equals(other.organization)) return
		 * false;
		 */
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		if (Double.doubleToLongBits(premium) != Double.doubleToLongBits(other.premium))
			return false;
		if (proposalNo == null) {
			if (other.proposalNo != null)
				return false;
		} else if (!proposalNo.equals(other.proposalNo))
			return false;
		if (proposalType != other.proposalType)
			return false;
		if (referral == null) {
			if (other.referral != null)
				return false;
		} else if (!referral.equals(other.referral))
			return false;
		if (saleMan == null) {
			if (other.saleMan != null)
				return false;
		} else if (!saleMan.equals(other.saleMan))
			return false;
//		TODO FIXME PSH
		/*
		 * if (salePoint == null) { if (other.salePoint != null) return false; }
		 * else if (!salePoint.equals(other.salePoint)) return false;
		 */
		if (submittedDate == null) {
			if (other.submittedDate != null)
				return false;
		} else if (!submittedDate.equals(other.submittedDate))
			return false;
		if (Double.doubleToLongBits(totalSI) != Double.doubleToLongBits(other.totalSI))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
}