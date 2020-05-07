package murraco.dto.tempDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentTypeTempDTO {

	private String id;

	private String name;

	private int month;

	private String description;

}
