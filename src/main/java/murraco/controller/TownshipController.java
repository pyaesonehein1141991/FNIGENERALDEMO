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
import murraco.dto.tempDTO.TownshipTempDTO;

@RestController
@RequestMapping("/township")
@Api(tags = "Townships")
public class TownshipController {

	@GetMapping("/townships")
	@ApiOperation(value = "${TownshipController.townships}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> townships() {
		List<TownshipTempDTO> resultList = populateRelationship();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<TownshipTempDTO> populateRelationship() {
		List<TownshipTempDTO> resultList = new ArrayList<>();

		TownshipTempDTO township1 = TownshipTempDTO.builder().id("ISSYS004001000000000104062019").name("Thanatpin")
				.code("MMR018009").build();
		TownshipTempDTO township2 = TownshipTempDTO.builder().id("ISSYS004001000000731126012017").name("Yankin")
				.code("MMR013010").build();
		TownshipTempDTO township3 = TownshipTempDTO.builder().id("ISSYS004001000000734326012017").name("Mayangone")
				.code("MMR013042").build();
		TownshipTempDTO township4 = TownshipTempDTO.builder().id("ISSYS004001000000732326012017")
				.name("Mingalartaungnyunt").code("MMR013022").build();
		TownshipTempDTO township5 = TownshipTempDTO.builder().id("ISSYS004001000000738625012017").name("Minbu")
				.code("MMR009007").build();

		resultList.add(township1);
		resultList.add(township2);
		resultList.add(township3);
		resultList.add(township4);
		resultList.add(township5);

		return resultList;
	}

}
