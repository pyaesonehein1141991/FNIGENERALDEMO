package murraco.dto;

import java.util.Date;

public class ProposalInsuredPersonDTO {

	private int paymentTerm;
	private int periodMonth;
	private int age;
	private double proposedSumInsured;
	private double proposedPremium;
	private double approvedSumInsured;
	private double approvedPremium;
	private double basicTermPremium;
	private double addOnTermPremium;
	private double endorsementNetBasicPremium;;
	private double endorsementNetAddonPremium;
	private String rejectReason;
	private String idNo;
	private String fatherName;
	private String parentName;
	private String parentIdNo;
	private Date dateOfBirth;
	private String address;
	public int getPaymentTerm() {
		return paymentTerm;
	}
	public void setPaymentTerm(int paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	public int getPeriodMonth() {
		return periodMonth;
	}
	public void setPeriodMonth(int periodMonth) {
		this.periodMonth = periodMonth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getProposedSumInsured() {
		return proposedSumInsured;
	}
	public void setProposedSumInsured(double proposedSumInsured) {
		this.proposedSumInsured = proposedSumInsured;
	}
	public double getProposedPremium() {
		return proposedPremium;
	}
	public void setProposedPremium(double proposedPremium) {
		this.proposedPremium = proposedPremium;
	}
	public double getApprovedSumInsured() {
		return approvedSumInsured;
	}
	public void setApprovedSumInsured(double approvedSumInsured) {
		this.approvedSumInsured = approvedSumInsured;
	}
	public double getApprovedPremium() {
		return approvedPremium;
	}
	public void setApprovedPremium(double approvedPremium) {
		this.approvedPremium = approvedPremium;
	}
	public double getBasicTermPremium() {
		return basicTermPremium;
	}
	public void setBasicTermPremium(double basicTermPremium) {
		this.basicTermPremium = basicTermPremium;
	}
	public double getAddOnTermPremium() {
		return addOnTermPremium;
	}
	public void setAddOnTermPremium(double addOnTermPremium) {
		this.addOnTermPremium = addOnTermPremium;
	}
	public double getEndorsementNetBasicPremium() {
		return endorsementNetBasicPremium;
	}
	public void setEndorsementNetBasicPremium(double endorsementNetBasicPremium) {
		this.endorsementNetBasicPremium = endorsementNetBasicPremium;
	}
	public double getEndorsementNetAddonPremium() {
		return endorsementNetAddonPremium;
	}
	public void setEndorsementNetAddonPremium(double endorsementNetAddonPremium) {
		this.endorsementNetAddonPremium = endorsementNetAddonPremium;
	}
	public String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentIdNo() {
		return parentIdNo;
	}
	public void setParentIdNo(String parentIdNo) {
		this.parentIdNo = parentIdNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
