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
import murraco.dto.tempDTO.SchoolTempDTO;

@RestController
@RequestMapping("/school")
@Api(tags = "School")
public class SchoolController {

	@GetMapping("/schools")
	@ApiOperation(value = "${SchoolController.schools}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> schools() {
		List<SchoolTempDTO> resultList = populateSchool();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<SchoolTempDTO> populateSchool() {
		List<SchoolTempDTO> resultList = new ArrayList<>();

		SchoolTempDTO school1 = SchoolTempDTO.builder().id("1").name("B.E.H.S(1)KAMAYUT")
				.schoolType("GOVERRNMENT_SCHOOL").schoolLevelType("HIGH").phoneNo("01-535910")
				.schoolCodeNo("SCH/12-2019/0000000001/001").build();
		SchoolTempDTO school2 = SchoolTempDTO.builder().id("10").name("B.E.P.S (14) KAMAYUT")
				.schoolType("GOVERRNMENT_SCHOOL").schoolLevelType("PRIMARY").phoneNo("09-73120959")
				.schoolCodeNo("SCH/12-2019/00000000010/001").build();
		SchoolTempDTO school3 = SchoolTempDTO.builder().id("3").name("B.E.H.S(3) KAMAYUT")
				.schoolType("GOVERRNMENT_SCHOOL").schoolLevelType("HIGH").phoneNo("01-535994")
				.schoolCodeNo("SCH/12-2019/0000000003/001").build();
		SchoolTempDTO school4 = SchoolTempDTO.builder().id("4").name("B.E.H.S(4) KAMAYUT")
				.schoolType("GOVERRNMENT_SCHOOL").schoolLevelType("HIGH").phoneNo("01-536010")
				.schoolCodeNo("SCH/12-2019/0000000004/001").build();
		SchoolTempDTO school5 = SchoolTempDTO.builder().id("6").name("B.E.H.S(T.TC) KAMAYUT")
				.schoolType("GOVERRNMENT_SCHOOL").schoolLevelType("HIGH").phoneNo("01-534332, 01-505610")
				.schoolCodeNo("SCH/12-2019/0000000006/001").build();

		resultList.add(school1);
		resultList.add(school2);
		resultList.add(school3);
		resultList.add(school4);
		resultList.add(school5);

		return resultList;
	}

}
