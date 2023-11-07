package entities;

import java.util.UUID;
import lombok.Data;
@Data
public class CandidatoEntity {
    private UUID id;
    private String nome;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;
}
