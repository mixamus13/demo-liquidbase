package com.example.demoliquidbase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Таблица Валюта
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Currency {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String description;

    @Column(name = "is_deleted")
    private Boolean deleted;

    @Column
    private Long updated;

    /**
     * Наименование валюты
     */
    @Column
    private String currencyName;
}
