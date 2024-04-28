package org.example.springassignment.repository;
import org.example.springassignment.register.ConsumerRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsumerRegisterRepository
        extends JpaRepository<ConsumerRegister,Long> {
    ConsumerRegister findBycID(Long cID);
}//[4]
