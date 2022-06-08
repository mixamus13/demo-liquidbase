package com.example.demoliquidbase.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Валюта")
public class CurrencyDto implements Serializable {

    @NotNull
    @Schema(description = "Уникальный идентификатор валюты")
    private Long id;

    @NotNull
    @Schema(description = "Описание валюты")
    private String description;
}
