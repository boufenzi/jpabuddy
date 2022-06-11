package jpa.buddy.jpabuddy.repository;

import jpa.buddy.jpabuddy.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}