package murraco.dto;

public class ResponseListDTO {
	private String groupProposalNo;
	private String bpmsInsuredPersonId;
	private String proposalNo;
	private String policyNo;
	private String customerId;
	public String getBpmsInsuredPersonId() {
		return bpmsInsuredPersonId;
	}
	public void setBpmsInsuredPersonId(String bpmsInsuredPersonId) {
		this.bpmsInsuredPersonId = bpmsInsuredPersonId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	public String getGroupProposalNo() {
		return groupProposalNo;
	}
	public void setGroupProposalNo(String groupProposalNo) {
		this.groupProposalNo = groupProposalNo;
	}
	
	
}
