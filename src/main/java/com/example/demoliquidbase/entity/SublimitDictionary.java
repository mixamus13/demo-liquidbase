package com.example.demoliquidbase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Наименование сублимита (Из справочника)
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SublimitDictionary {

    /**
     * ID наименования
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * Описание
     */
    private String description;

    /**
     * Признак удаления записи
     */
    private Boolean isDeleted;

    /**
     * Номер обновления записи
     */
    private Long updated;
}
