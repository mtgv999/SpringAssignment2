package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Reservation2;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.register.ReservationRegister2;
import org.example.springassignment.service.ReservationService2;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor

public class ReservationController2 {
    private final ReservationService2 reservationService;

    @PostMapping("/cLogin")//소비자로서 회원 가입 했는지 여부를
    // 로그인을 통해 확인하려는 요청-> "cLogin" 결과가 "Success" 뜰 때만,
    // 리뷰를 만들고, 정보 가져오고, 수정하고 삭제할 수 있음.
    public String cLogin(@RequestBody ConsumerLoginRequest cLReq){
        return reservationService.cLogin(cLReq);}

    @PostMapping("/make")//리뷰 만듬.
public Reservation2 makeReservation
            (@RequestBody ReservationRegister2 rsRegister){
        return reservationService.makeReservation(rsRegister);}

    @GetMapping("/get/{rsNumber}")//리뷰 정보 가져옴.
    public Reservation2 getReservation(@PathVariable Long rsNumber){
        return reservationService.getReservation(rsNumber);}

    @PutMapping("/change/{rsNumber}")//리뷰 수정
    public Reservation2 changeReservation(@PathVariable Long rsNumber,
    @RequestBody ReservationRegister2 rsRegister){
        return reservationService.changeReservation(rsNumber,rsRegister);}

    @DeleteMapping("delete/{rsNumber}")//리뷰 삭제
    public void deleteReservation(@PathVariable Long rsNumber){
        reservationService.deleteReservation(rsNumber);}
}