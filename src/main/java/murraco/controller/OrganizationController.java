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
import murraco.dto.tempDTO.OrganizationTempDTO;

@RestController
@RequestMapping("/organization")
@Api(tags = "Organization")
public class OrganizationController {

	@GetMapping("/organizations")
	@ApiOperation(value = "${OrganizationController.organizations}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> organizations() {
		List<OrganizationTempDTO> resultList = populateOrganization();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<OrganizationTempDTO> populateOrganization() {
		List<OrganizationTempDTO> resultList = new ArrayList<>();

		OrganizationTempDTO organization1 = OrganizationTempDTO.builder().id("ISSYS033001000000000104062019")
				.name("Direct Resouroes Service Co.,Ltd").phone("09-5185346").ownerName("Daw Ohm Mar Aung")
				.address("No.8, Building (45/5), Kabaaye Pagoda Road, ").build();
		OrganizationTempDTO organization2 = OrganizationTempDTO.builder().id("ISSYS033001000000001105062019")
				.name("Star tek Co.,Ltd").phone("").ownerName("")
				.address("No.62, C-1004/ 10th Floor, Mahar Bandular Condo, Pazundaung, East,").build();
		OrganizationTempDTO organization3 = OrganizationTempDTO.builder().id("ISSYS033001000000003607062019")
				.name("Swan Ahr Tagun Services Co., Ltd").phone("09962205555").ownerName("U Kaung Htet San")
				.address("A-4, Room(504), Bo Min Yaung Street, North Dagon.").build();
		OrganizationTempDTO organization4 = OrganizationTempDTO.builder().id("ISSYS033001000000005508062019")
				.name("Mandalay King Star Co.,Ltd").phone("09-798295737").ownerName("Daw Saing Nuu")
				.address("(64)Street? (Khaing Shwe War Street*Ma Naw Ha Yi)Between").build();
		OrganizationTempDTO organization5 = OrganizationTempDTO.builder().id("ISSYS033001000000005708062019")
				.name("Battery Compound Industry").phone("09-5322605").ownerName("U Htay Win")
				.address("No(105),Lower main Road,Phat Tan Qr").build();

		resultList.add(organization1);
		resultList.add(organization2);
		resultList.add(organization3);
		resultList.add(organization4);
		resultList.add(organization5);

		return resultList;
	}

}
