package com.example.demoliquidbase.sevice;

import com.example.demoliquidbase.entity.Currency;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencySublimitService {
    List<Currency> findAllCurrencySublimit();
    Currency addCurrencySublimit(Currency currency);
    void editSublimitApp(Currency currency);
    void deleteCurrencySublimit(Long id);
}
