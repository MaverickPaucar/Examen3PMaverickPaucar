package ec.edu.espe.arquitectura.examen3.dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientPhoneRQ {
    private String phoneType;
    private String phoneNumber;
    private Boolean isDefault;
    private String state;
}
