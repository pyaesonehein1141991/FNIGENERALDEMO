package murraco.dto;

import java.util.Date;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import io.swagger.annotations.ApiModelProperty;

public class GroupFarmerProposalInsuredPersonDTO {

  @ApiModelProperty(position = 0, example = "U", required = true)
  @NotBlank(message = "InitialId is mandatory")
  private String initialId;

  @ApiModelProperty(position = 1, example = "36221e42-a0000040-133dc830-59dccb1a", required = true)
  @NotBlank(message = "BPMS InsuredPersonId is mandatory")
  private String bpmsInsuredPersonId;

  @ApiModelProperty(position = 2, example = "100000", required = true)
  @NotNull(message = "proposedSumInsured is mandatory")
  private double proposedSumInsured;

  @ApiModelProperty(position = 3, example = "100000", required = true)
  @NotNull(message = "proposedPremium is mandatory")
  private double proposedPremium;

  @ApiModelProperty(position = 4, example = "10000", required = true)
  @NotNull(message = "approvedSumInsured is mandatory")
  private double approvedSumInsured;

  @ApiModelProperty(position = 5, example = "10000", required = true)
  @NotNull(message = "approvedPremium is mandatory")
  private double approvedPremium;

  @ApiModelProperty(position = 6, example = "10000", required = true)
  @NotNull(message = "basicTermPremium is mandatory")
  private double basicTermPremium;

  @ApiModelProperty(position = 7, example = "NRCNO", required = true)
  @NotNull(message = "idType is mandatory")
  private String idType;

  @ApiModelProperty(position = 8, example = "123123123")
  private String idNo;

  @ApiModelProperty(position = 9, example = "U Maung Maung", required = true)
  @NotBlank(message = "fatherName is mandatory")
  private String fatherName;

  @ApiModelProperty(position = 10, example = "2019-12-16", required = true)
  @NotNull(message = "startDate is mandatory")
  private Date startDate;

  @ApiModelProperty(position = 11, example = "2019-12-16", required = true)
  @NotNull(message = "endDate is mandatory")
  private Date endDate;

  @ApiModelProperty(position = 12, example = "1999-12-16", required = true)
  @NotNull(message = "dateOfBirth is mandatory")
  private Date dateOfBirth;

  @ApiModelProperty(position = 14, example = "MALE", required = true)
  @NotNull(message = "gender is mandatory")
  private String gender;

  @ApiModelProperty(position = 15, example = "Yangon", required = true)
  @NotNull(message = "residentAddress is mandatory")
  private String residentAddress;

  @ApiModelProperty(position = 16, example = "AUNG ", required = true)
  @NotNull(message = "firstName is mandatory")
  private String firstName;

  @ApiModelProperty(position = 17, example = "AUNG")
  private String middleName;

  @ApiModelProperty(position = 18, example = "AUNG")
  private String lastName;

  @ApiModelProperty(position = 19, example = "ISSYS011000009823001042019", required = true)
  @NotBlank(message = "occupationID is mandatory")
  private String occupationID;

  @ApiModelProperty(position = 20, example = "ISSYS001000005575112092016")
  private String customerID;

  @ApiModelProperty(position = 22, example = "ISSYS004000009724620062019", required = true)
  @NotBlank(message = "townshipId is mandatory")
  private String townshipId;

  @Valid
  @ApiModelProperty(position = 21)
  @NotNull(message = "insuredPersonBeneficiariesList is mandatory")
  private List<GrouopFarmerInsuredPersonBeneficiariesDTO> insuredPersonBeneficiariesList;

  public String getInitialId() {
    return initialId;
  }

  public void setInitialId(String initialId) {
    this.initialId = initialId;
  }

  public String getBpmsInsuredPersonId() {
    return bpmsInsuredPersonId;
  }

  public void setBpmsInsuredPersonId(String bpmsInsuredPersonId) {
    this.bpmsInsuredPersonId = bpmsInsuredPersonId;
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

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getResidentAddress() {
    return residentAddress;
  }

  public void setResidentAddress(String residentAddress) {
    this.residentAddress = residentAddress;
  }

  public String getTownshipId() {
    return townshipId;
  }

  public void setTownshipId(String townshipId) {
    this.townshipId = townshipId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getOccupationID() {
    return occupationID;
  }

  public void setOccupationID(String occupationID) {
    this.occupationID = occupationID;
  }

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public List<GrouopFarmerInsuredPersonBeneficiariesDTO> getInsuredPersonBeneficiariesList() {
    return insuredPersonBeneficiariesList;
  }

  public void setInsuredPersonBeneficiariesList(
      List<GrouopFarmerInsuredPersonBeneficiariesDTO> insuredPersonBeneficiariesList) {
    this.insuredPersonBeneficiariesList = insuredPersonBeneficiariesList;
  }


}
