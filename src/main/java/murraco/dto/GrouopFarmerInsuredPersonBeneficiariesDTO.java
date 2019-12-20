package murraco.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import murraco.model.common.Gender;
import murraco.model.common.IdType;

public class GrouopFarmerInsuredPersonBeneficiariesDTO {
	
	@ApiModelProperty(position = 0, example = "U", required = true)
	@NotBlank(message = "InitialId is mandatory")
	private String initialId;
	
	@ApiModelProperty(position = 1, example = "20", required = true)
	@NotNull(message = "age is mandatory")
	private int age;
	
	@ApiModelProperty(position = 2, example = "5", required = true)
	@NotNull(message = "percentage is mandatory")
	private float percentage;
	
	@ApiModelProperty(position = 3, example = "NRCNO", required = true)
	@NotBlank(message = "idType is mandatory")
	private IdType idType;
	
	@ApiModelProperty(position = 4, example = "123123123", required = true)
	private String idNo;

	@ApiModelProperty(position = 5, example = "MALE", required = true)
	@NotNull(message = "gender is mandatory")
	private Gender gender;

	@ApiModelProperty(position = 6, example = "Yangon", required = true)
	@NotBlank(message = "residentAddress is mandatory")
	private String residentAddress;
	
	@ApiModelProperty(position =11, example = "ISSYS011000009823001042019", required = true)
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public IdType getIdType() {
		return idType;
	}

	public void setIdType(IdType idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
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
