//package org.example.springassignment.service;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.example.springassignment.domain.Consumer;
//import org.example.springassignment.domain.Reservation0;
//import org.example.springassignment.login.ConsumerLoginRequest;
//import org.example.springassignment.register.ReservationRegister0;
//import org.example.springassignment.repository.ConsumerRepository;
//import org.example.springassignment.repository.ReservationRepository0;
//import org.springframework.stereotype.Service;
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class ReservationService0 {
//    private final ReservationRepository0 reservationRepository;
//    //private final ConsumerRepository consumerRepository;
//
//    /* public String cLogin(ConsumerLoginRequest cLReq) {
//        Consumer reqCo=consumerRepository.findBycID(cLReq.getCID());
//        if(reqCo.getCPW().longValue()==cLReq.getCPW())
//        //소비자 인지 아닌지 여부를 점장 번호, PW를 통해 확인
//        {return "Success!";}else return "Fail!";}*/
//
//    public Reservation0 makeReservation(ReservationRegister0 rsRegister) {
//        return reservationRepository.save(ReservationRegister0.rsForm(rsRegister));}
//
//    public Reservation0 getReservation(Long rsNumber) {
//        return reservationRepository.findByRsNumber(rsNumber);}
//
//    public Reservation0 changeReservation(Long rsNumber,
//    ReservationRegister0 rsRegister) {
//Reservation0 saved = reservationRepository.findByRsNumber(rsNumber);
//        saved.rsChange(rsRegister);return saved;}
//
//    public void deleteReservation(Long rsNumber) {
//            reservationRepository.deleteByRsNumber(rsNumber);}
//}