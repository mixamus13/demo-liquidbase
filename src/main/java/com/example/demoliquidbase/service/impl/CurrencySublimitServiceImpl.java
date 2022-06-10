package com.example.demoliquidbase.service.impl;

import com.example.demoliquidbase.entity.Currency;
import com.example.demoliquidbase.repository.CurrencyRepository;
import com.example.demoliquidbase.service.CurrencySublimitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencySublimitServiceImpl implements CurrencySublimitService {

    private final CurrencyRepository repository;

    @Override
    public List<Currency> findAllCurrencySublimit() {
        return repository.findAll();
    }

    @Override
    public Currency addCurrencySublimit(Currency currency) {
        return null;
    }

    @Override
    public void editSublimitApp(Currency currency) {

    }

    @Override
    public void deleteCurrencySublimit(Long id) {

    }
}
