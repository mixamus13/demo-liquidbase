package com.example.demoliquidbase.controller;

import com.example.demoliquidbase.dto.SublimitDictionaryDto;
import com.example.demoliquidbase.entity.SublimitDictionary;
import com.example.demoliquidbase.sevice.SublimitDictionaryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aplication/dictionary/sublimit")
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Справочник наименований сублимитов")
public class SublimitDictionaryController {

    private final SublimitDictionaryService sublimitDictionaryService;

    @GetMapping("/list")
    @Operation(summary = "Получение списка словаря сублимитов")
    public ResponseEntity<List<SublimitDictionaryDto>> getAllSublimitDictionary() {
        log.debug("Получен запрос на получения списка словаря сублимитов");
        var allSublimitDictionary = sublimitDictionaryService.getAllSublimitDictionary();
        log.debug("Получен список словаря сублимитов {}", allSublimitDictionary);
        return ResponseEntity.ok(allSublimitDictionary);
    }

    @GetMapping("/dictdto")
    public ResponseEntity<SublimitDictionary> getSubLimitDictDto() {
        SublimitDictionary sublimitDictionary = SublimitDictionary.builder()
                .id(3424)
                .description("EHlofs rywu")
                .isDeleted(true)
                .updated(1L)
                .build();
        log.debug("Получение dictionary dto {}", sublimitDictionary.getDescription());
        return ResponseEntity.ok(sublimitDictionary);
    }
}
