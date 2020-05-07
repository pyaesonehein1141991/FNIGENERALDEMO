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
import murraco.dto.tempDTO.RelationshipTempDTO;

@RestController
@RequestMapping("/relationship")
@Api(tags = "Relationship")
public class RelationshipController {

	@GetMapping("/relationship")
	@ApiOperation(value = "${RelationshipController.relationship}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired for invalid JWT token") })
	public ResponseDTO<Object> relationship() {
		List<RelationshipTempDTO> resultList = populateRelationship();
		ResponseDTO<Object> responseDTO = ResponseDTO.builder().status("Success").responseBody(resultList).build();
		return responseDTO;
	}

	private List<RelationshipTempDTO> populateRelationship() {
		List<RelationshipTempDTO> resultList = new ArrayList<>();

		RelationshipTempDTO relationship1 = RelationshipTempDTO.builder().id("ISSYS0120001000000000129032013")
				.name("FATHER").description("FATHER").build();
		RelationshipTempDTO relationship2 = RelationshipTempDTO.builder().id("ISSYS0120001000000000229032013")
				.name("MOTHER").description("MOTHER").build();
		RelationshipTempDTO relationship3 = RelationshipTempDTO.builder().id("ISSYS0120001000000000329032013")
				.name("HUSBAND").description("HUSBAND").build();
		RelationshipTempDTO relationship4 = RelationshipTempDTO.builder().id("ISSYS0120001000000000429032013")
				.name("WIFE").description("WIFE").build();
		RelationshipTempDTO relationship5 = RelationshipTempDTO.builder().id("ISSYS0120001000000000529032013")
				.name("SON").description("SON").build();

		resultList.add(relationship1);
		resultList.add(relationship2);
		resultList.add(relationship3);
		resultList.add(relationship4);
		resultList.add(relationship5);

		return resultList;
	}

}
