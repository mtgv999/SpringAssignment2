package org.example.springassignment.repository;
import org.example.springassignment.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShopRepository extends JpaRepository<Shop,Long>{
    Shop findByShopID(Long shopID);
    void deleteByShopID(Long shopID);
}
