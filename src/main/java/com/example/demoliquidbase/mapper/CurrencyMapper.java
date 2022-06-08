package com.example.demoliquidbase.mapper;

import com.example.demoliquidbase.dto.CurrencyDto;
import com.example.demoliquidbase.entity.Currency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {

    CurrencyDto toDto(Currency currency);

    Currency toEntity(CurrencyDto currencyDto);
}
