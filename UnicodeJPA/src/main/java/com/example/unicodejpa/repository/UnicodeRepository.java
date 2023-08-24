package com.example.unicodejpa.repository;

import com.example.unicodejpa.model.UniCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<UniCode, Integer>
{
}
