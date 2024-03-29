package participantManagerApi.domain.dto;

import lombok.Data;

@Data
public class ParticipantRequest {
    private Long code;
    private Boolean status;
    private String name;
    private String externalCode;
    private String mail;
    private Integer phoneNumber;
    private Integer cpfCnpj;
    private String gender;
    private String marital;
    private Integer document;
    private String spouse;
    private Boolean notAplicateCnpjCpf;
    private Boolean tokenSms;
    private Boolean exposedPerson;
    private Boolean digitalSignature;
}
