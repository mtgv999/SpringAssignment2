//package org.example.springassignment.requestnResponse;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.*;
//import org.example.springassignment.domain.BaseEntity;
//
//public class MakeSellerAccount2 {//점장(판매자) 계정 생성(만들기)
//    @Getter
//    @Setter
//    public static class Request{//생성 요청
//        private Long sID;//점장 ID
//    }
//    @Getter
//    @Builder
//    @Setter
//    @NoArgsConstructor
//    @AllArgsConstructor
//    public static class Response extends BaseEntity {@Id//생성 결과
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private String sName;//점장 이름
//        private Long sPW;//점장 비밀번호
//        private Long sPhoneNumber;//점장 전화번호
//    }}//[2][3][4]