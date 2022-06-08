package com.example.demoliquidbase.sevice;

import com.example.demoliquidbase.dto.SublimitDto;
import com.example.demoliquidbase.entity.Sublimit;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SublimitService {
    List<Sublimit> findAllSublimit();
    Optional<Sublimit> findSublimitById(UUID id);
    Sublimit addSublimit(SublimitDto sublimitDto);
    void editSublimitApp(Sublimit sublimit);
    void deleteSublimit(UUID id);
}
