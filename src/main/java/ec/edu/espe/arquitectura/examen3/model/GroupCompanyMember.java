package ec.edu.espe.arquitectura.examen3.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GroupCompanyMember {
    private String groupRole;
    private String clientId;
    private String state;
    private Date creationDate;
    private Date lastModifiedDate;
}
