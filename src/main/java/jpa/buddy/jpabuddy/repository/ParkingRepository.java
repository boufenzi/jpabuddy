package jpa.buddy.jpabuddy.repository;

import jpa.buddy.jpabuddy.entity.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {
}