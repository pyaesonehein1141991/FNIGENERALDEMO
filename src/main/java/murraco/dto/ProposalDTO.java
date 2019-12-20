package murraco.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class ProposalDTO {
	
	@NotBlank
	private Date submittedDate;
	@NotNull
	private String proposalType;
	@NotNull
	private String proposalStatus;
	@NotNull
	private String customerClsOfHealth;
	@NotNull
	private String branch;
	

	private String paymentType;
	

	private List<ProposalInsuredPersonDTO> proposalInsuredPersonList;

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getProposalType() {
		return proposalType;
	}

	public void setProposalType(String proposalType) {
		this.proposalType = proposalType;
	}

	public String getProposalStatus() {
		return proposalStatus;
	}

	public void setProposalStatus(String proposalStatus) {
		this.proposalStatus = proposalStatus;
	}

	public String getCustomerClsOfHealth() {
		return customerClsOfHealth;
	}

	public void setCustomerClsOfHealth(String customerClsOfHealth) {
		this.customerClsOfHealth = customerClsOfHealth;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	



	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	
	public List<ProposalInsuredPersonDTO> getProposalInsuredPersonList() {
		return proposalInsuredPersonList;
	}

	public void setProposalInsuredPersonList(List<ProposalInsuredPersonDTO> proposalInsuredPersonList) {
		this.proposalInsuredPersonList = proposalInsuredPersonList;
	}

	

}
