package jpa.buddy.jpabuddy.repository;

import jpa.buddy.jpabuddy.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}