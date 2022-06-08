package com.example.demoliquidbase.copmposer;

import com.example.demoliquidbase.dto.SublimitDto;
import com.example.demoliquidbase.entity.Sublimit;
import com.example.demoliquidbase.exceptions.NotFoundException;
import com.example.demoliquidbase.mapper.SublimitDictionaryMapper;
import com.example.demoliquidbase.mapper.SublimitMapper;
import com.example.demoliquidbase.repository.SublimitDictionaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SublimitComposer {

    private final SublimitDictionaryRepository repository;
    private final SublimitMapper mapper;
    private final SublimitDictionaryMapper dictionaryMapper;

    public Sublimit prepareEntity(SublimitDto sublimitDto) {
        var sublimit = mapper.toEntity(sublimitDto);

        if (sublimitDto.getSublimitDictionary() != null && sublimitDto.getSublimitDictionary().getId() != null) {
            sublimit.setSublimitDictionary(repository.getById(sublimit.getSublimitDictionary().getId()));
        }
        return sublimit;
    }

    public SublimitDto prepareDto(Sublimit sublimit) {
        var sublimitDto = mapper.toDto(sublimit);

        if (sublimit.getSublimitDictionary() != null && sublimit.getSublimitDictionary().getId() != null) {
            var dictionaryDto = dictionaryMapper.toDto(repository
                    .findById(sublimit.getSublimitDictionary().getId())
                    .orElseThrow(() -> new NotFoundException("Не удалось найти словарь сублимитов по id " +
                            sublimit.getSublimitDictionary().getId())));
            sublimitDto.setSublimitDictionary(dictionaryDto);
        }
        return sublimitDto;
    }
}
