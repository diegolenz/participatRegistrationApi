package participantManagerApi.domain.dto;

import lombok.Data;

@Data
public class ParticipantResponse {
    private Long code;
    private Boolean status;
    private String name;
    private String externalCode;
    private Integer phoneNumber;
    private Integer cpfCnpj;
    private Boolean digitalSignature;
}
