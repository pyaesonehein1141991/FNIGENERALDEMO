package murraco.dto.studentlife;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SurveyQuestionAnswerDTO {

	@ApiModelProperty(position = 0, example = "ISSYS048000000000107082019")
	@NotBlank(message = "questionId is mandatory")
	private String questionId;

	@ApiModelProperty(position = 1, example = "TRUE")
	@NotNull(message = "answer is mandatory")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<String> answerList;

}
