package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.BusOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusOwnerRepository extends JpaRepository<BusOwnerEntity, Long> {

}
