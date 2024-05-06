package org.example.springassignment.repository;
import org.example.springassignment.domain.Reservation2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservationRepository2 extends
        JpaRepository<Reservation2,Long> {
    Reservation2 findByRsNumber(Long rsNumber);//예약 번호로 찾기
    void deleteByRsNumber(Long rsNumber);}//예약 삭제
