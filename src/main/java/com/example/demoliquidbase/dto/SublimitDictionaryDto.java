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
@Schema(description = "Наименование сублимита (Из справочника)")
public class SublimitDictionaryDto implements Serializable {

    @NotNull
    @Schema(description = "ID наименования")
    private Integer id;

    @NotNull
    @Schema(description = "Описание")
    private String description;
}
