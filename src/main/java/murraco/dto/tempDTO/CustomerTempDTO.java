package murraco.dto.tempDTO;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import murraco.model.common.Gender;
import murraco.model.common.IdType;
import murraco.model.common.MaritalStatus;

@Data
@Builder
public class CustomerTempDTO {
	private String id;

	private Date dateOfBirth;

	private String fatherName;

	private String fullIdNo;

	private Gender gender;

	private IdType idType;

	private String initialId;

	private MaritalStatus marialStatus;

	private String mobile;

	private String firstName;

	private String middleName;

	private String lastName;

	private String address;
}
