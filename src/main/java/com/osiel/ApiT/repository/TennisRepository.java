package com.osiel.ApiT.repository;

import com.osiel.ApiT.model.Tennis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TennisRepository extends JpaRepository<Tennis, Long> {

    List<Tennis> findByBrand(String brand);

    List<Tennis> findByColor(String color);

    Optional<Tennis> findByName(String name);
}
