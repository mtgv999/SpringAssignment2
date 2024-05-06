package org.example.springassignment.repository;
import org.example.springassignment.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SellerRepository extends JpaRepository<Seller,Long>{//점장
    Seller findBysID(Long sID);//점장 ID로 찾기
    //Seller findBysNumber(Long sNumber);//점장 번호로 찾기
    void deleteBysID(Long sID);}//점장 계정 삭제