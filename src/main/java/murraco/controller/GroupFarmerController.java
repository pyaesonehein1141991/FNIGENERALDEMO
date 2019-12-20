package murraco.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import murraco.dto.GroupFarmerLifeProposalDTO;
import murraco.dto.GroupFarmerProposalInsuredPersonDTO;
import murraco.dto.ResponseDTO;
import murraco.dto.ResponseListDTO;

@RestController
@RequestMapping("/groupfarmer")
@Api(tags = "Group-Farmer")
public class GroupFarmerController {
	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/submitproposal")
	@ApiOperation(value = "${GroupFarmerController.submitproposal}")
	@ApiResponses(value = { //
			@ApiResponse(code = 400, message = "Something went wrong"), //
			@ApiResponse(code = 403, message = "Access denied"), //
			@ApiResponse(code = 422, message = "Username is already in use"), //
			@ApiResponse(code = 500, message = "Expired or inv6alid JWT token") })
	public ResponseDTO<Object> submitproposal(@Valid @RequestBody GroupFarmerLifeProposalDTO groupFarmerProposalDTO) {
		ResponseListDTO dto = new ResponseListDTO();
		List<String> policyNoList = new ArrayList<>();
		for(GroupFarmerProposalInsuredPersonDTO insuredPerson:groupFarmerProposalDTO.getProposalInsuredPersonList()) {
			policyNoList.add(insuredPerson.getPersonCode().concat("/F/1904/0000000006"));
		}
		dto.setPolicyNoList(policyNoList);
		ResponseDTO<Object> responseDTO = ResponseDTO.builder()
				.status("Success!")
				.body(dto).build();
		
		return responseDTO;
	}

}
