package murraco.dto;

import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.model.common.Gender;
import murraco.model.common.IdType;

@Data
public class StudentLifeProposalInsuredPersonDTO {

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
  private IdType idType;

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

  @ApiModelProperty(position = 13, example = "MALE", required = true)
  @NotNull(message = "gender is mandatory")
  private Gender gender;

  @ApiModelProperty(position = 14, example = "Yangon", required = true)
  @NotNull(message = "residentAddress is mandatory")
  private String residentAddress;

  @ApiModelProperty(position = 15, example = "AUNG ", required = true)
  @NotNull(message = "firstName is mandatory")
  private String firstName;

  @ApiModelProperty(position = 16, example = "AUNG")
  private String middleName;

  @ApiModelProperty(position = 17, example = "AUNG")
  private String lastName;

  @ApiModelProperty(position = 18, example = "ISSYS011000009823001042019", required = true)
  @NotBlank(message = "occupationID is mandatory")
  private String occupationID;

  @ApiModelProperty(position = 19, example = "ISSYS001000005575112092016")
  private String customerID;

  @ApiModelProperty(position = 20, example = "ISSYS004000009724620062019", required = true)
  @NotBlank(message = "townshipId is mandatory")
  private String townshipId;

  // need field by thk
  @ApiModelProperty(position = 21, example = "10", required = true)
  @NotBlank(message = "Age is mandatory")
  private String age;

  @ApiModelProperty(position = 22, example = "true")
  private boolean approve;

  @ApiModelProperty(position = 23, example = "true")
  private boolean needMedicalCheckup;

  @ApiModelProperty(position = 24, example = "need a field", required = true)
  @NotBlank(message = "rejectReason is mandatory")
  private String rejectReason;

  @ApiModelProperty(position = 25, example = "ISSYS004001000000000104062019", required = true)
  @NotNull(message = "residentTownshipid is mandatory")
  private String residentTownshipId;

  @ApiModelProperty(position = 26, example = "ISSYS0120001000000000129032013", required = true)
  @NotNull(message = "relationshipid is mandatory")
  private String relationShipId;

  @ApiModelProperty(position = 27, example = "09969281638", required = true)
  @NotBlank(message = "phone is mandatory")
  private String phone;

  @ApiModelProperty(position = 28, example = "U Tun Tun", required = true)
  @NotBlank(message = "parentName is mandatory")
  private String parentName;

  @ApiModelProperty(position = 29, example = "NRCNO", required = true)
  @NotBlank(message = "parentType is mandatory")
  private String parentIdType;

  @ApiModelProperty(position = 30, example = "1628943", required = true)
  @NotBlank(message = "parentIdNO is mandatory")
  private String parentIdNo;

  @ApiModelProperty(position = 31, example = "1999-12-16", required = true)
  @NotBlank(message = "parentDOB is mandatory")
  private String parentDOB;

  @ApiModelProperty(position = 32, example = "ISSYS0120001000000000129032013", required = true)
  @NotNull(message = "gradeInfoId is mandatory")
  private String gradeInfoId;


  @ApiModelProperty(position = 33)
  private MultipartFile[] insuredpersonattachmentList;


  @Valid
  @ApiModelProperty(position = 17, required = true)
  @NotNull(message = "birthCertificateAttachment is mandatory")
  private MultipartFile[] birthCertificateAttachment;

  @Valid
  @ApiModelProperty(position = 17, required = true)
  @NotNull(message = "surveyQuestionAnswerList is mandatory")
  private MultipartFile[] surveyQuestionAnswerList;


  @ApiModelProperty(position = 17)
  private MultipartFile[] insuredPersonPolicyHistoryRecordList;



}
