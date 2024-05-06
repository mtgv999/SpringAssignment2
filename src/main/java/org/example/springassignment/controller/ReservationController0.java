//package org.example.springassignment.controller;
//import lombok.RequiredArgsConstructor;
//import org.example.springassignment.domain.Reservation0;
//import org.example.springassignment.login.ConsumerLoginRequest;
//
//import org.example.springassignment.register.ReservationRegister0;
//import org.example.springassignment.service.ReservationService0;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/reservation")
//@RequiredArgsConstructor
//
//public class ReservationController0 {
//    private final ReservationService0 reservationService;
//
//    /* @PostMapping("/cLogin")// 소비자가 회원 가입을 했는지의 여부를
//    // 로그인(점장 번호, PW 확인)을 통해 확인하려는 요청 "cLogin" 결과가
//    // "Success" 뜰때만, 예약을 만들고, 정보 가져오고, 수정하고 삭제 해야 됨.
//    public String cLogin(@RequestBody ConsumerLoginRequest cLReq){
//        return reservationService.cLogin(cLReq);} */
//
//    @PostMapping("/make")//점장(판매자) 계정 만듬.(점장 회원 가입)
//    public Reservation0 makeReservation(@RequestBody ReservationRegister0 rsRegister){
//        return reservationService.makeReservation(rsRegister);}
//
//    @GetMapping("/get/{rsNumber}")//점장 정보 가져옴.
//    public Reservation0 getReservation(@PathVariable Long rsNumber){
//        return reservationService.getReservation(rsNumber);}
//
//    @PutMapping("/change/{rsNumber}")//소비자 정보 수정
//    public Reservation0 changeReservation(@PathVariable Long rsNumber,
//    @RequestBody ReservationRegister0 rsRegister){
//        return reservationService.changeReservation(rsNumber,rsRegister);}
//
//    @DeleteMapping("/delete/{rsNumber}")//점장 계정 삭제-
//    //점장의 ID, PW 확인 후 삭제
//    public void deleteReservation(@PathVariable Long rsNumber){
//        reservationService.deleteReservation(rsNumber);}
//}