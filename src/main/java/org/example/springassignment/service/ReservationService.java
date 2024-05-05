package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Reservation;
import org.example.springassignment.register.ReservationRegister;
import org.example.springassignment.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {//예약
    private final ReservationRepository reservationRepository;

    public Reservation makeReservation(ReservationRegister rsRegister) {
        return reservationRepository.save(ReservationRegister.rsForm(rsRegister));}

    public Reservation getReservation(Long rsNumber) {
        return reservationRepository.findByRsNumber(rsNumber);}

    public Reservation changeReservation(Long rsNumber, ReservationRegister rsRegister) {
        Reservation saved= reservationRepository.findByRsNumber(rsNumber);
        saved.rsChange(rsRegister);return saved;}

    public void deleteReservation(Long rsNumber) {
        reservationRepository.deleteByRsNumber(rsNumber);}
}