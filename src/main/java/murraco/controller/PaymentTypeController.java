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
import murraco.dto.tempDTO.PaymentTypeTempDTO;

@RestController
@RequestMapping("/paymentType")
@Api(tags = "PaymentType")
public class PaymentTypeController {

	@GetMapping("/paymentTypes")
	@ApiOperation(value = "${PaymentTypeController.paymentTypes}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> paymentTypes() {
		List<PaymentTypeTempDTO> resultList = populatePaymentTypes();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<PaymentTypeTempDTO> populatePaymentTypes() {
		List<PaymentTypeTempDTO> resultList = new ArrayList<>();

		PaymentTypeTempDTO paymentType1 = PaymentTypeTempDTO.builder().id("ISSYS0090001000000000129032013      ")
				.name("ANNUAL").month(12).description("ANNUAL").build();
		PaymentTypeTempDTO paymentType2 = PaymentTypeTempDTO.builder().id("ISSYS0090001000000000229032013      ")
				.name("SEMI-ANNUAL").month(6).description("SEMI-ANNUAL").build();
		PaymentTypeTempDTO paymentType3 = PaymentTypeTempDTO.builder().id("ISSYS0090001000000000329032013      ")
				.name("QUARTER").month(3).description("QUARTER").build();
		PaymentTypeTempDTO paymentType4 = PaymentTypeTempDTO.builder().id("ISSYS0090001000000000429032013      ")
				.name("LUMPSUM").month(0).description("LUMPSUM").build();
		PaymentTypeTempDTO paymentType5 = PaymentTypeTempDTO.builder().id("ISSYS0090001000000000529032013      ")
				.name("MONTHLY").month(1).description("MONTHLY").build();

		resultList.add(paymentType1);
		resultList.add(paymentType2);
		resultList.add(paymentType3);
		resultList.add(paymentType4);
		resultList.add(paymentType5);

		return resultList;
	}

}
