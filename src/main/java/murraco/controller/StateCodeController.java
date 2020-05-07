package murraco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.ResponseDTO;
import murraco.dto.tempDTO.StatCodeTempDTO;

//@RestController
//@RequestMapping("/stateCode")
//@Api(tags = "StateCodes")
public class StateCodeController {

	@GetMapping("/statecodes")
	@ApiOperation(value = "${StateCodeController.statecodes}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> statecodes() {
		List<StatCodeTempDTO> resultList = populateRelationship();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<StatCodeTempDTO> populateRelationship() {
		List<StatCodeTempDTO> resultList = new ArrayList<>();
		return resultList;
	}

}
