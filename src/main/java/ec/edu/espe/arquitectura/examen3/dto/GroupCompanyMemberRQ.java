package ec.edu.espe.arquitectura.examen3.dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupCompanyMemberRQ {
    private String groupRole;
    private String clientId;
    private String state;
}