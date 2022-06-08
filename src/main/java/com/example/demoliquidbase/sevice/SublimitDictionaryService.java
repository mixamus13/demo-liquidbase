package com.example.demoliquidbase.sevice;

import com.example.demoliquidbase.dto.SublimitDictionaryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SublimitDictionaryService {
    List<SublimitDictionaryDto> getAllSublimitDictionary();
}
