package com.example.demoliquidbase.controller;

import com.example.demoliquidbase.dto.SublimitDto;
import com.example.demoliquidbase.entity.Sublimit;
import com.example.demoliquidbase.sevice.SublimitService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/application")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Наименование сублимитов")
public class SublimitController {

    private final SublimitService sublimitService;

    @GetMapping("/sublimit/list")
    public ResponseEntity<List<Sublimit>> getSublimitApp() {
        var allSublimit = sublimitService.findAllSublimit();
        log.debug("Получен список сублимитов {}", allSublimit);
        return ResponseEntity.ok(allSublimit);
    }

    @GetMapping("/sublimit/{id}")
    public ResponseEntity<Optional<Sublimit>> getSublimitById(@PathVariable UUID id) {
        Optional<Sublimit> sublimit = sublimitService.findSublimitById(id);
        log.debug("Найден сублимит c ID {}", id);
        return ResponseEntity.ok(sublimit);
    }

    @PostMapping("/sublimit/add")
    public void createSublimit(@Valid @RequestBody SublimitDto sublimitDto) {
        sublimitService.addSublimit(sublimitDto);
        log.debug("Добавлен новый сублимит c ID {}", sublimitDto.getId());
        ResponseEntity.ok(sublimitDto);
    }

    @DeleteMapping("/sublimit/{id}")
    public void deleteSublimitById(@PathVariable UUID id) {
        sublimitService.deleteSublimit(id);
        log.debug("Удалён сублимит по ID {}", id);
    }
}
