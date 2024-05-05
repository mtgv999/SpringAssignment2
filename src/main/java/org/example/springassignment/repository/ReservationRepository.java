package org.example.springassignment.repository;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservationRepository extends
        JpaRepository<Reservation,Long> {//예약
    Reservation findByRsNumber(Long rsNumber);//예약 번호로 찾기
    void deleteByRsNumber(Long rsNumbeer);//예약 삭제
}