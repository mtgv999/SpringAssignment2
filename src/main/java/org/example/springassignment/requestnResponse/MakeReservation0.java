//package org.example.springassignment.requestnResponse;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.*;
//import org.example.springassignment.domain.BaseEntity;
//
//public class MakeReservation0 {//점장(판매자) 계정 만들기
//    @Getter
//    @Setter
//    public static class Request{
//        private Long rsNumber;//점장(판매자)
//    }
//    @Getter
//    @Builder
//    @Setter
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class Response extends BaseEntity{@Id //생성 결과
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        //private Long cID;
//        //private Long cNumber;//점장 번호
//        //private Long sPhoneNumber;//점장 전화번호
//
//        private Long rsDate;//예약 날짜
//        private Long rsTime;//예약 시간
//        private String menu;//예약 메뉴
//        private String table;//예약 테이블
//
//
//    }}