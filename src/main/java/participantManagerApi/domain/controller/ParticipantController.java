package participantManagerApi.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import participantManagerApi.domain.dto.ParticipantRequest;
import participantManagerApi.domain.dto.ParticipantResponse;
import participantManagerApi.domain.entity.Participant;
import participantManagerApi.domain.service.ParticipantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping
    private ResponseEntity<List<ParticipantResponse>> findAll() {
        List<ParticipantResponse> participants = this.participantService.find();

        if (CollectionUtils.isEmpty(participants)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(participants);
    }

    @GetMapping("/{code}")
    private ResponseEntity<Participant> findByCode(@PathVariable("code") Long code) {
        Optional<Participant> participant = this.participantService.findByCode(code);

        if (participant.isEmpty())
            ResponseEntity.notFound().build();

        return ResponseEntity.ok(participant.get());
    }

    @PostMapping
    private ResponseEntity insert(@RequestBody ParticipantRequest participantRequest) {
        participantService.insert(participantRequest);
        return ResponseEntity
                .ok().build();
    }

    @PutMapping
    private ResponseEntity upadte(@RequestBody ParticipantRequest participantRequest) {
        participantService.update(participantRequest);
        return ResponseEntity
                .ok().build();
    }

}
