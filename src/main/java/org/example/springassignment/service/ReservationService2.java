package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.domain.Reservation2;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.register.ReservationRegister2;
import org.example.springassignment.repository.ConsumerRepository;
import org.example.springassignment.repository.ReservationRepository2;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ReservationService2 {//리뷰
    private final ReservationRepository2 reservationRepository;
    private final ConsumerRepository consumerRepository;

    public String cLogin(ConsumerLoginRequest cLReq){
        Consumer reqCo=consumerRepository.findBycID
                (cLReq.getCID());//소비자 인지 아닌지 여부
        if(reqCo.getCPW().longValue()==cLReq.getCPW())
        {return "Success!";}else return "Fail!";}

    public Reservation2 makeReservation(ReservationRegister2 rsRegister) {
        return reservationRepository.save(ReservationRegister2.rsForm(rsRegister));}

    public Reservation2 getReservation(Long rsNumber) {
        return reservationRepository.findByRsNumber(rsNumber);}

    public Reservation2 changeReservation(Long rsNumber,
    ReservationRegister2 rsRegister) {
        Reservation2 saved= reservationRepository.findByRsNumber(rsNumber);
        saved.rsChange(rsRegister);return saved;}

    public void deleteReservation(Long rsNumber) {
        reservationRepository.deleteByRsNumber(rsNumber);}
}
