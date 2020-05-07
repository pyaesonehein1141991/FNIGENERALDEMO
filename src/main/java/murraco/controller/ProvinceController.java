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
import murraco.dto.tempDTO.ProvinceTempDTO;

@RestController
@RequestMapping("/province")
@Api(tags = "Province")
public class ProvinceController {

	@GetMapping("/province")
	@ApiOperation(value = "${ProvinceController.province}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> province() {
		List<ProvinceTempDTO> resultList = populateProvince();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<ProvinceTempDTO> populateProvince() {
		List<ProvinceTempDTO> resultList = new ArrayList<>();

		ProvinceTempDTO province1 = ProvinceTempDTO.builder().id("ISSYS006001000000558409012017").name("Kayah")
				.description("Kayah").code("MMR002").build();
		ProvinceTempDTO province2 = ProvinceTempDTO.builder().id("ISSYS006001000000558509012017").name("Kayin")
				.description("Kayin").code("MMR003").build();
		ProvinceTempDTO province3 = ProvinceTempDTO.builder().id("ISSYS006001000000558609012017").name("Chin")
				.description("Chin").code("MMR004").build();
		ProvinceTempDTO province4 = ProvinceTempDTO.builder().id("ISSYS006001000000558709012017").name("Sagaing")
				.description("Sagaing").code("MMR005").build();
		ProvinceTempDTO province5 = ProvinceTempDTO.builder().id("ISSYS006001000000558809012017").name("Tanintharyi")
				.description("Tanintharyi").code("MMR006").build();

		resultList.add(province1);
		resultList.add(province2);
		resultList.add(province3);
		resultList.add(province4);
		resultList.add(province5);

		return resultList;
	}

}
