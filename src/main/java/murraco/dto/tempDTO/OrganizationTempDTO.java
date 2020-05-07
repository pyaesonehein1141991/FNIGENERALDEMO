package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganizationTempDTO {

	private String id;

	private String name;

	private String phone;

	private String ownerName;

	private String address;

}
