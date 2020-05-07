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
import murraco.dto.tempDTO.CountryTempDTO;

@RestController
@RequestMapping("/country")
@Api(tags = "Countrys")
public class CountryController {

	@GetMapping("/countrys")
	@ApiOperation(value = "${CountryController.countrys}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> countrys() {
		List<CountryTempDTO> resultList = populateCountry();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<CountryTempDTO> populateCountry() {
		List<CountryTempDTO> resultList = new ArrayList<>();

		CountryTempDTO country1 = CountryTempDTO.builder().id("ISSYS0070001000000000129032013").name("MYANMAR")
				.code("MYANMAR").description(" Republic of the Union of Myanmar").build();
		CountryTempDTO country2 = CountryTempDTO.builder().id("ISSYS007001000000000108062019").name("JAPAN").code("JPN")
				.description("JAPAN").build();
		CountryTempDTO country3 = CountryTempDTO.builder().id("ISSYS007001000000000208062019").name("South KOREA")
				.code("0").description("South KOREA").build();
		CountryTempDTO country4 = CountryTempDTO.builder().id("ISSYS007001000000001109072019").name("CAMBODIA")
				.code("-").description("CAMBODIA").build();
		CountryTempDTO country5 = CountryTempDTO.builder().id("ISSYS007001000000003126112019").name("USA").code("0")
				.description("USA").build();

		resultList.add(country1);
		resultList.add(country2);
		resultList.add(country3);
		resultList.add(country4);
		resultList.add(country5);

		return resultList;
	}

}
