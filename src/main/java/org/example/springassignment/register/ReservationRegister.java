//package org.example.springassignment.register;
//import lombok.*;
//import org.example.springassignment.domain.Reservation;
//@Getter
//@Builder
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReservationRegister{//예약 등록
//    private Long cID;//소비자 ID
//    private Long cNumber;//소비자 번호
//    private Long cPhoneNumber;//소비자 전화번호
//
//    private Long rsDate;//예약 날짜
//    private Long rsTime;//예약 시간
//    private String menu;//메뉴
//    private String table;//예약 테이블
//
//    public static Reservation rsForm(ReservationRegister
//              rsRegister){//예약 등록 형식
//        return Reservation.builder()
//                .cID(rsRegister.getCID())
//                .cNumber(rsRegister.getCNumber())
//                .cPhoneNumber(rsRegister.getCPhoneNumber())
//
//                .rsDate(rsRegister.getRsDate())
//                .rsTime(rsRegister.getRsTime())
//                .menu(rsRegister.getMenu())
//                .table(rsRegister.getTable()).build();}
//}