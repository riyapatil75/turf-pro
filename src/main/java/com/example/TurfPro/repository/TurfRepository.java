package com.example.TurfPro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.TurfPro.entity.Turf;

import java.util.List;

public interface TurfRepository extends JpaRepository<Turf, Long> {

    List<Turf> findBySportType(String sportType);

    List<Turf> findByLocationContaining(String location);

}