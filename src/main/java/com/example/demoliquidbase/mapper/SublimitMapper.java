package com.example.demoliquidbase.mapper;

import com.example.demoliquidbase.dto.SublimitDto;
import com.example.demoliquidbase.entity.Sublimit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SublimitMapper {

    Sublimit toEntity(SublimitDto sublimitDto);
    SublimitDto toDto(Sublimit sublimit);

    List<SublimitDto> toDtos(List<Sublimit> sublimits);
}
