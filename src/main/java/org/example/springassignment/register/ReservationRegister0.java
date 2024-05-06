//package org.example.springassignment.register;
//import lombok.*;
//import org.example.springassignment.domain.Reservation0;
//
//@Getter
//@Builder
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReservationRegister0 {//판매자(점장) 등록
//    //private Long cID;//소비자 ID
//    //private Long cNumber;//소비자 번호
//    //private Long cPhoneNumber;//소비자 전화번호
//
//    private Long rsDate;
//    private Long rsTime;
//    private String menu;
//    private String table;
//
//    public static Reservation0 rsForm
//            (ReservationRegister0 rsRegister){
//        return Reservation0.builder()
//                //.cID(rsRegister.getCID())
//                //.cNumber(rsRegister.getCNumber())
//                //.cPhoneNumber(rsRegister.getCPhoneNumber())
//
//                .rsDate(rsRegister.getRsDate())
//                .rsTime(rsRegister.getRsTime())
//                .menu(rsRegister.getMenu())
//                .table(rsRegister.getTable()).build();}}