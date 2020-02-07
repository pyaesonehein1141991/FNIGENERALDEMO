package murraco.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;

public class GrouopFarmerInsuredPersonBeneficiariesDTO {

	@ApiModelProperty(position = 0, example = "U", required = true)
	@NotBlank(message = "InitialId is mandatory")
	private String initialId;

	@ApiModelProperty(position = 1, example = "2019-12-16", required = true)
	@NotNull(message = "dob is mandatory")
	private String dob;

	@ApiModelProperty(position = 2, example = "5", required = true)
	@NotNull(message = "percentage is mandatory")
	private float percentage;

	@ApiModelProperty(position = 3, example = "NRCNO", required = true)
	@NotBlank(message = "idType is mandatory")
	private String idType;

	@ApiModelProperty(position = 4, example = "123123123", required = true)
	private String idNo;

	@ApiModelProperty(position = 5, example = "MALE", required = true)
	@NotNull(message = "gender is mandatory")
	private String gender;

	@ApiModelProperty(position = 6, example = "Yangon", required = true)
	@NotBlank(message = "residentAddress is mandatory")
	private String residentAddress;

	@ApiModelProperty(position = 11, example = "ISSYS011000009823001042019", required = true)
	@NotBlank(message = "townshipId is mandatory")
	private String townshipId;

	@ApiModelProperty(position = 7, example = "Aung", required = true)
	@NotBlank(message = "firstName is mandatory")
	private String firstName;

	@ApiModelProperty(position = 8, example = "Aung", required = true)
	private String middleName;

	@ApiModelProperty(position = 9, example = "Aung", required = true)
	private String lastName;

	@ApiModelProperty(position = 10, example = "ISSYS012000009552804092019", required = true)
	@NotBlank(message = "relationshipID is mandatory")
	private String relationshipID;

	public String getInitialId() {
		return initialId;
	}

	public void setInitialId(String initialId) {
		this.initialId = initialId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
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

	public String getRelationshipID() {
		return relationshipID;
	}

	public void setRelationshipID(String relationshipID) {
		this.relationshipID = relationshipID;
	}

}
