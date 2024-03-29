package participantManagerApi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import participantManagerApi.domain.dto.ParticipantResponse;
import participantManagerApi.domain.entity.Participant;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

    Optional<Participant> findByCode(Long code);

    @Query(nativeQuery = true, value = "SELECT  " +
                    " code, " +
                    " status, " +
                    " name, " +
                    " externalCode, " +
                    " phoneNumber, " +
                    " cpfCnpj, " +
                    " digitalSignature FROM tb_participant "
    )
    List<ParticipantResponse> find();

}


