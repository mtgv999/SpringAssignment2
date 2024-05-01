package org.example.springassignment.repository;
import org.example.springassignment.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SellerRepository extends JpaRepository<Seller,Long>{
    Seller findBySName(String sName);
    Seller findBysID(Long sID);
    void deleteBysID(Long sID);
}