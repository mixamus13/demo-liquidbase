package com.example.demoliquidbase.repository;

import com.example.demoliquidbase.entity.Sublimit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SublimitRepository extends JpaRepository<Sublimit, UUID> {
}