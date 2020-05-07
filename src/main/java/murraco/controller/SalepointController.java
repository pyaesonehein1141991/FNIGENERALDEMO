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
import murraco.dto.tempDTO.SalepointTempDTO;

@RestController
@RequestMapping("/salepoint")
@Api(tags = "Salepoints")
public class SalepointController {

	@GetMapping("/salepoints")
	@ApiOperation(value = "${SalepointController.salepoints}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> salepoints() {
		List<SalepointTempDTO> resultList = populateSalepoints();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<SalepointTempDTO> populateSalepoints() {
		List<SalepointTempDTO> resultList = new ArrayList<>();

		SalepointTempDTO salepoint1 = SalepointTempDTO.builder().id("ISSYS052001000000000101062019").name("HEAD OFFICE")
				.code("HO").description("HEAD OFFICE").build();
		SalepointTempDTO salepoint2 = SalepointTempDTO.builder().id("ISSYS052001000000000201062019").name("MANDALAY")
				.code("MDY").description("MANDALAY").build();
		SalepointTempDTO salepoint3 = SalepointTempDTO.builder().id("ISSYS052001000000000301062019").name("MONYWA")
				.code("MWA").description("MONYWA").build();
		SalepointTempDTO salepoint4 = SalepointTempDTO.builder().id("ISSYS052001000000000401062019").name("SANCHAUNG")
				.code("SCG").description("SANCHAUNG").build();
		SalepointTempDTO salepoint5 = SalepointTempDTO.builder().id("ISSYS052001000000000501062019").name("KALAY")
				.code("KLY").description("KALAY").build();

		resultList.add(salepoint1);
		resultList.add(salepoint2);
		resultList.add(salepoint3);
		resultList.add(salepoint4);
		resultList.add(salepoint5);

		return resultList;
	}
}
