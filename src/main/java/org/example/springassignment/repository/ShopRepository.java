package org.example.springassignment.repository;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShopRepository extends JpaRepository<Shop,Long>{//상점
    Shop findByShopID(Long shopID);
    Seller findBysID(Long sID);
    void deleteByShopID(Long shopID);
}
