package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//constructor with arguments
public class ErrorMessageDTO {
    private String message;
    private String field;


}
