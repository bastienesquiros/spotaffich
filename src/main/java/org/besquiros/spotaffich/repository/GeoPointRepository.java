package org.besquiros.spotaffich.repository;

import org.besquiros.spotaffich.entity.GeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface GeoPointRepository extends JpaRepository<BigDecimal, GeoPoint> {
}
