package participantManagerApi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import participantManagerApi.domain.dto.ParticipantRequest;
import participantManagerApi.domain.dto.ParticipantResponse;
import participantManagerApi.domain.entity.Participant;
import participantManagerApi.domain.repository.ParticipantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public void insert(ParticipantRequest request) {
        participantRepository.save(new Participant(request));
    }

    public void update(ParticipantRequest request) {
        participantRepository.save(new Participant(request));
    }

    public Optional<Participant> findByCode(Long code) {
        return participantRepository.findByCode(code);
    }

    public List<ParticipantResponse> find() {
        return participantRepository.find();
    }

}
