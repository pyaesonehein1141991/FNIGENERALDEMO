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
import murraco.dto.tempDTO.OccupationTempDTO;

@RestController
@RequestMapping("/occupation")
@Api(tags = "Occupation")
public class OccupationController {

	@GetMapping("/occupations")
	@ApiOperation(value = "${OccupationController.occupations}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> occupations() {
		List<OccupationTempDTO> resultList = populateOccupation();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<OccupationTempDTO> populateOccupation() {
		List<OccupationTempDTO> resultList = new ArrayList<>();

		OccupationTempDTO occupation1 = OccupationTempDTO.builder().id("ISSYS011001000000005119062019")
				.name("DEPENDANT").description("DEPENDANT").build();
		OccupationTempDTO occupation2 = OccupationTempDTO.builder().id("ISSYS011001000000006124062019").name("AGENCY")
				.description("AGENCY").build();
		OccupationTempDTO occupation3 = OccupationTempDTO.builder().id("ISSYS011001000000008126072019")
				.name("Junior skill Technician").description("Junior skill Technician").build();
		OccupationTempDTO occupation4 = OccupationTempDTO.builder().id("ISSYS011001000000009101082019").name("Seaman")
				.description("Seaman").build();
		OccupationTempDTO occupation5 = OccupationTempDTO.builder().id("ISSYS011001000000011127082019")
				.name("Transportation Officer").description("Transportation Officer").build();

		resultList.add(occupation1);
		resultList.add(occupation2);
		resultList.add(occupation3);
		resultList.add(occupation4);
		resultList.add(occupation5);

		return resultList;
	}

}
