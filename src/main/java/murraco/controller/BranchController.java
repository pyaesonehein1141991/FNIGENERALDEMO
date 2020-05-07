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
import murraco.dto.tempDTO.BranchTempDTO;

@RestController
@RequestMapping("/branch")
@Api(tags = "Branches")
public class BranchController {

	@GetMapping("/branches")
	@ApiOperation(value = "${BranchController.branches}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> branches() {
		List<BranchTempDTO> resultList = populateBranch();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<BranchTempDTO> populateBranch() {
		List<BranchTempDTO> resultList = new ArrayList<>();

		BranchTempDTO branch = BranchTempDTO.builder().id("BANCH00000000000000129032013        ").name("Head Office")
				.branchCode("001").address("No.5,MICT Park,Hlaing.").build();

		resultList.add(branch);

		return resultList;
	}

}
