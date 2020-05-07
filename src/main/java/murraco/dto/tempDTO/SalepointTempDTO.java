package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SalepointTempDTO {

	private String id;

	private String name;

	private String code;

	private String description;

}
