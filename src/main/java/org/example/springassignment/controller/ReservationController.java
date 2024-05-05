package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Reservation;
import org.example.springassignment.register.ReservationRegister;
import org.example.springassignment.service.ReservationService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {//예약
    private final ReservationService reservationService;
    @PostMapping("/make")//예약 만듬
    public Reservation makeReservation(@RequestBody
    ReservationRegister rsRegister){
        return reservationService.makeReservation(rsRegister);}

    @GetMapping("/get/{rsNumber}")//예약 정보 가져옴.
    public Reservation getReservation(@PathVariable Long rsNumber){
        return reservationService.getReservation(rsNumber);}

    @PutMapping("/change/{rsNumber}")//예약 정보 수정
    public Reservation changeReservation(@PathVariable Long rsNumber,
    @RequestBody ReservationRegister rsRegister){
return reservationService.changeReservation(rsNumber,rsRegister);}

    @DeleteMapping("/delete/{rsNumber}")//예약 정보 삭제
    public void deleteReservation(@PathVariable Long rsNumber){
        reservationService.deleteReservation(rsNumber);}
}