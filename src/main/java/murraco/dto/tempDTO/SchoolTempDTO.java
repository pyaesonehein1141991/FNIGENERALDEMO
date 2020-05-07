package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolTempDTO {

	private String id;

	private String name;

	private String schoolType;

	private String schoolLevelType;

	private String phoneNo;

	private String schoolCodeNo;

}
