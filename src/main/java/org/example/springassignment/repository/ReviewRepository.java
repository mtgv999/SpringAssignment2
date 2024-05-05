package org.example.springassignment.repository;
import org.example.springassignment.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReviewRepository extends
        JpaRepository<Review,Long> {//리뷰
    Review findByRvNumber(Long rvNumber);//리뷰 번호로 찾기
    void deleteByRvNumber(Long rvNumber);}//리뷰 삭제