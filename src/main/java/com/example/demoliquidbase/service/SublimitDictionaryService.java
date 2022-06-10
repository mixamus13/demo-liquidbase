package com.example.demoliquidbase.service;

import com.example.demoliquidbase.dto.SublimitDictionaryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SublimitDictionaryService {
    List<SublimitDictionaryDto> getAllSublimitDictionary();
}
