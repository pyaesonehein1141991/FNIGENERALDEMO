package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BranchTempDTO {

	private String id;

	private String name;

	private String branchCode;

	private String address;

}
