package com.example.heritage.Repositories;

import com.example.heritage.Entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {
}
