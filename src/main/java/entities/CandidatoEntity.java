package entities;
import jakarta.validation.constraints.Email;
import java.util.UUID;
import lombok.Data;
@Data
public class CandidatoEntity {
    private UUID id;
    private String nome;
    private String username;
    @Email(message = "O campo [email] deve vonter um e-mail válido")
    private String email;
    private String password;
    private String description;
    private String curriculum;
}
