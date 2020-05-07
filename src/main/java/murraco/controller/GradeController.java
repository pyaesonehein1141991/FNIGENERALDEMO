package murraco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.ResponseDTO;
import murraco.dto.tempDTO.GradeTempDTO;

@RestController
@RequestMapping("/grade")
@Api(tags = "Grades")
public class GradeController {

	@GetMapping("/grades")
	@ApiOperation(value = "${GradeController.grades}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> grades() {
		List<GradeTempDTO> resultList = populateGrades();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<GradeTempDTO> populateGrades() {
		List<GradeTempDTO> resultList = new ArrayList<>();

		GradeTempDTO grade1 = GradeTempDTO.builder().id("1").name("Grade-1").description("Grade-1").build();
		GradeTempDTO grade2 = GradeTempDTO.builder().id("2").name("Grade-2").description("Grade-2").build();
		GradeTempDTO grade3 = GradeTempDTO.builder().id("3").name("Grade-3").description("Grade-3").build();
		GradeTempDTO grade4 = GradeTempDTO.builder().id("4").name("KG").description("KG").build();

		resultList.add(grade1);
		resultList.add(grade2);
		resultList.add(grade3);
		resultList.add(grade4);

		return resultList;
	}

}
