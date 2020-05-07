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
import murraco.dto.tempDTO.BankTempDTO;

@RestController
@RequestMapping("/bank")
@Api(tags = "Banks")
public class BankController {

	@GetMapping("/banks")
	@ApiOperation(value = "${BankController.banks}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> banks() {
		List<BankTempDTO> resultList = populateBank();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<BankTempDTO> populateBank() {
		List<BankTempDTO> resultList = new ArrayList<>();

		BankTempDTO bank1 = BankTempDTO.builder().id("ISSYS010001000000002207082019").name("Yoma Bank Current")
				.description("Yoma Bank 000110290001230 Current A/C").build();
		BankTempDTO bank2 = BankTempDTO.builder().id("ISSYS010001000000001128062019").name("CB Bank Current")
				.description("CB Bank 0078100500001104 Current A/C").build();
		BankTempDTO bank3 = BankTempDTO.builder().id("ISSYS010001000000002407082019").name("MAB Bank Current ")
				.description("MAB Bank 0450123045003841016 Current A/C").build();
		BankTempDTO bank4 = BankTempDTO.builder().id("ISSYS010001000000003127082019").name("AGD Bank Current")
				.description("AGD Bank 3250011001278019 Current A/C").build();
		BankTempDTO bank5 = BankTempDTO.builder().id("ISSYS010001000000003227082019").name("CB Bank Saving")
				.description("CB Bank 0078600300000639 Saving A/C").build();

		resultList.add(bank1);
		resultList.add(bank2);
		resultList.add(bank3);
		resultList.add(bank4);
		resultList.add(bank5);

		return resultList;
	}

}
