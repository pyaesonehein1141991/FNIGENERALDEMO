package murraco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.ResponseDTO;
import murraco.dto.tempDTO.TownshipCodeTempDTO;

//@RestController
//@RequestMapping("/townshpCode")
//@Api(tags = "TownshipCodes")
public class TownshipCodeController {

	@GetMapping("/townshipcodes")
	@ApiOperation(value = "${TownshipCodeController.townshipcodes}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> townshipcodes() {
		List<TownshipCodeTempDTO> resultList = populateRelationship();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<TownshipCodeTempDTO> populateRelationship() {
		List<TownshipCodeTempDTO> resultList = new ArrayList<>();
		return resultList;
	}

}
