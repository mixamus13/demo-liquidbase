package com.example.demoliquidbase.service.impl;

import com.example.demoliquidbase.copmposer.SublimitComposer;
import com.example.demoliquidbase.dto.SublimitDto;
import com.example.demoliquidbase.entity.Sublimit;
import com.example.demoliquidbase.mapper.SublimitMapper;
import com.example.demoliquidbase.repository.SublimitRepository;
import com.example.demoliquidbase.service.SublimitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class SublimitServiceImpl implements SublimitService {

    private final SublimitRepository repository;
    private final SublimitMapper mapper;

    private final SublimitComposer composer;

    @Override
    public List<Sublimit> findAllSublimit() {
        List<Sublimit> sublimits = repository.findAll();
        mapper.toDtos(sublimits);
        return sublimits;
    }

    @Override
    public Optional<Sublimit> findSublimitById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public Sublimit addSublimit(SublimitDto sublimitDto) {
        Sublimit sublimit = composer.prepareEntity(sublimitDto);
        return repository.save(sublimit);
    }

    @Override
    public void editSublimitApp(Sublimit sublimit) {
        // change
        // get log
        repository.save(sublimit);
    }

    @Override
    public void deleteSublimit(UUID id) {
        repository.deleteById(id);
    }
}
