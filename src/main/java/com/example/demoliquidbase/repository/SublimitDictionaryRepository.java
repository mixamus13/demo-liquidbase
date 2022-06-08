package com.example.demoliquidbase.repository;

import com.example.demoliquidbase.entity.SublimitDictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SublimitDictionaryRepository extends JpaRepository<SublimitDictionary, Integer> {
}
