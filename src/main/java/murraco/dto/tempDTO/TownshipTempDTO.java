package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TownshipTempDTO {

	private String id;

	private String name;

	private String code;
}
