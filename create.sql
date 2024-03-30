create table participant (code  bigserial not null, cpf_cnpj varchar(255), digital_signature boolean, document varchar(255), exposed_person boolean, external_code varchar(255), gender varchar(255), mail varchar(255), marital varchar(255), name varchar(255), not_aplicate_cnpj_cpf boolean, phone_number varchar(255), spouse varchar(255), status boolean, token_sms boolean, primary key (code))

INSERT INTO participant (code, cpf_cnpj, digital_signature, "document", exposed_person, external_code, gender, mail, marital, "name", not_aplicate_cnpj_cpf, phone_number, spouse, status, token_sms) VALUES(nextval('participant_code_seq'::regclass), '', false, '', false, '', '', '', '', '', false, '', '', false, false);