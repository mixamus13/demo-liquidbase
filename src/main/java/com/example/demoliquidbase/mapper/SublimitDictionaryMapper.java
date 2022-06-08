package com.example.demoliquidbase.mapper;

import com.example.demoliquidbase.dto.SublimitDictionaryDto;
import com.example.demoliquidbase.entity.SublimitDictionary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SublimitDictionaryMapper {

    SublimitDictionaryDto toDto(SublimitDictionary sublimitDictionary);
}
