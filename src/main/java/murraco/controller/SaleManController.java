package murraco.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import murraco.dto.tempDTO.CustomerTempDTO;
import murraco.model.common.Gender;
import murraco.model.common.IdType;
import murraco.model.common.MaritalStatus;

@RestController
@RequestMapping("/saleman")
@Api(tags = "SaleMan")
public class SaleManController {

	@GetMapping("/salemans")
	@ApiOperation(value = "${SaleManController.salemans}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> salemans() {
		List<CustomerTempDTO> resultList = populateSaleMan();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<CustomerTempDTO> populateSaleMan() {
		List<CustomerTempDTO> customerList = new ArrayList<>();

		try {
			CustomerTempDTO customer1 = CustomerTempDTO.builder().id("ISSYS001001000000000103062019")
					.dateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse("2019/06/03")).fatherName("")
					.fullIdNo("7/DAOUNA(N)159492").gender(Gender.MALE).idType(IdType.NRCNO).initialId("U")
					.marialStatus(MaritalStatus.SINGLE).mobile("09781166822").firstName("Hein Ko Latt").middleName("")
					.lastName("").address("No(108),Melzigone Street,(7)Quater").build();
			CustomerTempDTO customer2 = CustomerTempDTO.builder().id("ISSYS001001000000000203062019")
					.dateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse("1999/03/03")).fatherName("")
					.fullIdNo("12/YAPATHA(N)106769").gender(Gender.MALE).idType(IdType.NRCNO).initialId("U")
					.marialStatus(MaritalStatus.SINGLE).mobile("09253108434").firstName("Nyi Nyi Aung").middleName("")
					.lastName("").address("No(231-A),Panchan(10),(9)Quater").build();
			CustomerTempDTO customer3 = CustomerTempDTO.builder().id("ISSYS001001000000000303062019")
					.dateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse("1988/06/09")).fatherName("U Win Zaw")
					.fullIdNo("8/PAKHAKA(N)260252").gender(Gender.FEMALE).idType(IdType.NRCNO).initialId("Daw")
					.marialStatus(MaritalStatus.SINGLE).mobile("09253108434").firstName("Chit").middleName("Su")
					.lastName("Win Zaw").address("No.(9), Naung Pin Street ").build();
			CustomerTempDTO customer4 = CustomerTempDTO.builder().id("ISSYS001001000000000303062019")
					.dateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse("1990/05/23")).fatherName("U Paw Tun")
					.fullIdNo("8/YASAKA(N)170646").gender(Gender.MALE).idType(IdType.NRCNO).initialId("U")
					.marialStatus(MaritalStatus.SINGLE).mobile("09253108434").firstName("Naing ").middleName("Tun ")
					.lastName("Oo").address("Yay Sa Kyo Township, Kine (2) Village").build();
			CustomerTempDTO customer5 = CustomerTempDTO.builder().id("ISSYS001001000000001304062019")
					.dateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse("1993/02/27")).fatherName("U Tun Tun Oo")
					.fullIdNo("5/YABANA(N)217066").gender(Gender.FEMALE).idType(IdType.NRCNO).initialId("Daw")
					.marialStatus(MaritalStatus.MARRIED).mobile("").firstName("Hnin").middleName("Su ")
					.lastName("Hlaing").address("No.8, Aung Chanthar Ward,").build();

			customerList.add(customer1);
			customerList.add(customer2);
			customerList.add(customer3);
			customerList.add(customer4);
			customerList.add(customer5);

		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customerList;
	}

}
