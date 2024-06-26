//package org.example.springassignment.requestnResponse;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.*;
//import org.example.springassignment.domain.BaseEntity;
//
//public class MakeReservation {//예약 생성
//    @Getter
//    @Setter
//    public static class Request {//생성 요청
//        private Long rsNumber;//소비자 번호
//    }
//    @Getter
//    @Builder
//    @Setter
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class Response extends BaseEntity {@Id//생성 결과
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long cID;//소비자 ID
//        private Long cNumber;//소비자 번호
//        private Long cPhoneNumber;//소비자 전화번호
//
//        private Long rsDate;//예약 날짜
//        private Long rsTime;//예약 시간
//        private String menu;//예약 메뉴
//        private String table;//예약 테이블
//    }}