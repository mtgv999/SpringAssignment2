//package org.example.springassignment.controller;
//import lombok.RequiredArgsConstructor;
//import org.example.springassignment.domain.Reservation;
//import org.example.springassignment.login.ConsumerLoginRequest;
//import org.example.springassignment.register.ReservationRegister;
//import org.example.springassignment.service.ReservationService;
//import org.springframework.web.bind.annotation.*;
//@RestController
//@RequestMapping("/reservation")
//@RequiredArgsConstructor
//
//public class ReservationController {//예약
//    private final ReservationService reservationService;
//
//    @PostMapping("/cLogin")
//    //소비자로서 회원 가입 했는지 여부를 로그인을 통해 확인하려는 요청-> "cLogin" 결과가
//    //"Success" 뜰때만, 예약을 만들고, 정보 가져오고, 수정하고 삭제 해야 됨.
//    public String cLogin(@RequestBody ConsumerLoginRequest cLReq){
//        return reservationService.cLogin(cLReq);}
//
//    @PostMapping("/make")//예약 만듬
//    public Reservation makeReservation(@RequestBody
//    ReservationRegister rsRegister){
//        return reservationService.makeReservation(rsRegister);}
//
//    @GetMapping("/get/{rsNumber}")//예약 정보 가져옴.
//    public Reservation getReservation(@PathVariable Long rsNumber){
//        return reservationService.getReservation(rsNumber);}
//
//    @PutMapping("/change/{rsNumber}")//예약 정보 수정
//    public Reservation changeReservation(@PathVariable Long rsNumber,
//    @RequestBody ReservationRegister rsRegister){
//return reservationService.changeReservation(rsNumber,rsRegister);}
//
//    @DeleteMapping("/delete/{rsNumber}")//예약 정보 삭제
//    public void deleteReservation(@PathVariable Long rsNumber){
//        reservationService.deleteReservation(rsNumber);}
//}