package com.example.demoliquidbase.sevice.impl;

import com.example.demoliquidbase.dto.SublimitDictionaryDto;
import com.example.demoliquidbase.entity.SublimitDictionary;
import com.example.demoliquidbase.mapper.SublimitDictionaryMapper;
import com.example.demoliquidbase.repository.SublimitDictionaryRepository;
import com.example.demoliquidbase.sevice.SublimitDictionaryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class SublimitDictionaryServiceImpl implements SublimitDictionaryService {

    private final SublimitDictionaryRepository repository;
    private final SublimitDictionaryMapper mapper;

    @Override
    public List<SublimitDictionaryDto> getAllSublimitDictionary() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
