package org.example.springassignment.repository;
import org.example.springassignment.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsumerRepository
    extends JpaRepository<Consumer,Long>{
    Consumer findBycName(String cName);
    Consumer findBycID(Long cID);
    void deleteBycID(Long cID);}