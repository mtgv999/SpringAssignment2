package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;

import java.time.LocalDateTime;

public class MakeReservation2 {//예약 생성(만들기)
    @Getter
    @Setter
    public static class Request {//생성 요청
        private Long rsNumber;//예약 번호
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id//생성 결과
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long cID;//소비자 아이디
        private Long cNumber;//소비자 번호
        private Long cPhoneNumber;//소비자 전화번호

        //private Long rsDate;//예약 날짜
        private LocalDateTime rsTime;//예약 날짜+시간
        private String menu;//예약 메뉴
        private String tables;//예약 테이블
    }}

