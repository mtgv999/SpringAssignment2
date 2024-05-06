//package org.example.springassignment.domain;
//import jakarta.persistence.*;
//import lombok.*;
//import org.example.springassignment.register.ReservationRegister0;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//@Builder
//@Setter
//@Entity
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
//public class Reservation0 extends BaseEntity {@Id//판매자(점장)
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long rsNumber;//예약 번호
//    private Long cID;//소비자 ID
//    private Long cNumber;//소비자 번호
//    private Long cPhoneNumber;//소비자 전화번호
//
//    private Long rsDate;//예약 날짜
//    private Long rsTime;//예약 시간
//    private String menu;//예약 메뉴
//    private String table;//예약 테이블
//
//    public void rsChange(ReservationRegister0 rsRegister){//점장 정보 수정 형식
//        this.rsDate=rsRegister.getRsDate();
//        this.rsTime=rsRegister.getRsTime();
//        this.menu=rsRegister.getMenu();
//        this.table=rsRegister.getTable();}}