package ec.edu.espe.arquitectura.examen3.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientAddressRQ {
    private String locationId;//fk
    private String typeAddress;
    private String line1;
    private String line2;
    private Float latitude;
    private Float longitude;
    private Boolean isDefault;
    private String state;
}