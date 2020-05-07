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
import murraco.dto.tempDTO.HospitalTempDTO;

@RestController
@RequestMapping("/hospital")
@Api(tags = "Hospitals")
public class HospitalController {

	@GetMapping("/hospitals")
	@ApiOperation(value = "${HospitalController.hospitals}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> hospitals() {
		List<HospitalTempDTO> resultList = populateHospitals();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<HospitalTempDTO> populateHospitals() {
		List<HospitalTempDTO> resultList = new ArrayList<>();

		HospitalTempDTO hospital = HospitalTempDTO.builder().id("95051").name("Asia Royal ").phone("012-548-70")
				.address("Baho Road").build();

		resultList.add(hospital);

		return resultList;
	}

}
