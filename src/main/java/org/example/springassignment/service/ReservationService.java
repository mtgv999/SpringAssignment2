package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.domain.Reservation;
import org.example.springassignment.login.ConsumerLoginRequest;
import org.example.springassignment.register.ReservationRegister;
import org.example.springassignment.repository.ConsumerRepository;
import org.example.springassignment.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService {//예약
    private final ReservationRepository reservationRepository;
    private final ConsumerRepository consumerRepository;

    public String cLogin(ConsumerLoginRequest cLReq){
        Consumer reqCo=consumerRepository.findBycID
                (cLReq.getCID());//소비자 인지 아닌지 여부
        if(reqCo.getCPW().longValue()==cLReq.getCPW())
        {return "Success!";}else return "Fail!";}

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