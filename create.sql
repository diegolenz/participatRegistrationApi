
CREATE TABLE participant (
	code int8 NOT NULL,
	cpf_cnpj int4 NULL,
	digital_signature bool NULL,
	"document" int4 NULL,
	exposed_person bool NULL,
	external_code varchar(255) NULL,
	gender varchar(255) NULL,
	mail varchar(255) NULL,
	marital varchar(255) NULL,
	"name" varchar(255) NULL,
	not_aplicate_cnpj_cpf bool NULL,
	phone_number int4 NULL,
	spouse varchar(255) NULL,
	status bool NULL,
	token_sms bool NULL,
	CONSTRAINT participant_pkey PRIMARY KEY (code)
);

INSERT INTO participant
(code, cpf_cnpj, digital_signature, "document", exposed_person, external_code, gender, mail, marital, "name", not_aplicate_cnpj_cpf, phone_number, spouse, status, token_sms)
VALUES(0, 0, false, 0, false, '', '', '', '', '', false, 0, '', false, false);

