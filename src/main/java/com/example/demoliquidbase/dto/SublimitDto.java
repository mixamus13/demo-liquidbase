package com.example.demoliquidbase.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Структура  DTO сублимитов")
public class SublimitDto implements Serializable {

    @NotNull
    @Schema(description = "Уникальный идентификатор сублимита")
    private UUID id;

    @NotNull
    @Schema(description = "Наименование сублимита")
    private SublimitDictionaryDto sublimitDictionary;

    @NotNull
    @Schema(description = "Сумма сублимита")
    private BigDecimal sublimitSum;

    @NotNull
    @Schema(description = "Валюта")
    private CurrencyDto currency;

    @NotNull
    @Schema(description = "Сумма сублимита в рублях")
    private BigDecimal sublimitSumToRub;

    @NotNull
    @Schema(description = "Срок сублимита в месяцах")
    private Integer sublimitPeriod;
}
