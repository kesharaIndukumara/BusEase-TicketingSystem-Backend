package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.BusOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusOwnerRepository extends JpaRepository<BusOwnerEntity, Long> {
    Optional<BusOwnerEntity> findByEmail(String email);
}
