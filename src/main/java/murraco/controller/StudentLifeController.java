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
import murraco.dto.ResponseDTO;
import murraco.dto.ResponseListDTO;
import murraco.dto.StudentLifeProposalDTO;
import murraco.dto.StudentLifeProposalInsuredPersonDTO;



@RestController
@RequestMapping("/studentlife")
@Api(tags = "Student_Life")
public class StudentLifeController {

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/submitproposal")
  @ApiOperation(value = "${StudentLifeController.submitproposal}")
  @ApiResponses(value = {@ApiResponse(code = 400, message = "Something went wrong"),
      @ApiResponse(code = 403, message = "Access denied"),
      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
  public ResponseDTO<Object> submitproposal(
      @Valid @RequestBody StudentLifeProposalDTO studentLifeProposalDTO) {

    ResponseListDTO dto = new ResponseListDTO();
    List<ResponseListDTO> responseList = new ArrayList<>();
    for (StudentLifeProposalInsuredPersonDTO insuredPerson : studentLifeProposalDTO
        .getProposalInsuredPersonList()) {
      dto.setBpmsInsuredPersonId(insuredPerson.getBpmsInsuredPersonId());
      dto.setPolicyNo("S/1904/0000000006");
      dto.setProposalNo("SP/1904/0000000006");
      if (insuredPerson.getCustomerID().equals(null) || insuredPerson.getCustomerID().isEmpty()) {
        dto.setCustomerId("CUS111");
      }
      responseList.add(dto);
    }
    ResponseDTO<Object> responseDTO =
        ResponseDTO.builder().responseStatus("Success!").responseBody(responseList).build();

    return responseDTO;

  }



}

