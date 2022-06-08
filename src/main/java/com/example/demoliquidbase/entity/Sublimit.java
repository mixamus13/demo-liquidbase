package com.example.demoliquidbase.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Сублимит заявки
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sublimit {

    /**
     * Уникальный идентификатор сублимита
     */
    @Id
    @GeneratedValue
    private UUID id;

    /**
     * Идентификатор заявки
     */
    private UUID applicationId;

    /**
     * Идентифкатор пользователя добавившего сублимит
     */
    private UUID author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sublimit_dictionary_id")
    @ToString.Exclude
    private SublimitDictionary sublimitDictionary;

    /**
     * Сумма сублимита
     */
    private BigDecimal sublimitSum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id")
    @ToString.Exclude
    private Currency currency;

    /**
     * Сумма сублимита в рублях
     */
    private BigDecimal sublimitSumToRub;

    /**
     * Срок сублимита
     */
    private Integer sublimitPeriod;
}
