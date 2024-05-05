package org.example.springassignment.requestnResponse;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

public class MakeReservation {//예약 생성
    @Getter
    @Setter
    public static class Request {//생성 요청
        private Long rsNumber;//소비자 번호
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{@Id//생성 결과
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long rsDate;//예약 날짜
        private Long rsTime;//예약 시간
        private String menu;//예약 메뉴
    }}