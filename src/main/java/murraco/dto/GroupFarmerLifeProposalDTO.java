package murraco.dto;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import murraco.configuration.DateHandler;

@Data
public class GroupFarmerLifeProposalDTO {

	@ApiModelProperty(position = 0, example = "2019-12-16", required = true)
	@NotNull(message = "SubmittedDate is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date submittedDate;

	@ApiModelProperty(position = 1, example = "2019-12-16", required = true)
	@NotNull(message = "End Date is mandatory")
	@JsonDeserialize(using = DateHandler.class)
	private Date endDate;

	@ApiModelProperty(position = 4, example = "ISSYS033000009784102042019", required = true)
	@NotNull(message = "organizationID SI is mandatory")
	private String organizationID;

	@ApiModelProperty(position = 5, example = "ISSYS0090001000000000429032013", required = true)
	@NotBlank(message = "paymentTypeId is mandatory")
	private String paymentTypeId;

	@ApiModelProperty(position = 6, example = "ISSYS002000009756217052019", required = true)
	@NotBlank(message = "agentID is mandatory")
	private String agentID;

	@ApiModelProperty(position = 7, example = "ISSYS001000005575112092016")
	private String referralID;

	@ApiModelProperty(position = 8, example = "ISSYS022000009634116052019")
	private String saleManId;

	@ApiModelProperty(position = 9, example = "BANCH00000000000000129032018", required = true)
	@NotBlank(message = "branchId is mandatory")
	private String branchId;

	@ApiModelProperty(position = 10, example = "11", required = true)
	@NotBlank(message = "salePointId is mandatory")
	private String salePointId;

	@Valid
	@ApiModelProperty(position = 11, required = true)
	@NotNull(message = "proposalInsuredPersonList is mandatory")
	private List<GroupFarmerProposalInsuredPersonDTO> proposalInsuredPersonList;

	@ApiModelProperty(position = 12, example = "TRF", required = true)
	@NotBlank(message = "paymentChannel is mandatory")
	private String paymentChannel;

	@ApiModelProperty(position = 13, example = "ISSYS010005000000021118072016", required = true)
	private String toBank;

	@ApiModelProperty(position = 14, example = "ISSYS0100001000000000713032013", required = true)
	private String fromBank;

	@ApiModelProperty(position = 15, example = "CH34345345", required = true)
	private String chequeNo;

}
