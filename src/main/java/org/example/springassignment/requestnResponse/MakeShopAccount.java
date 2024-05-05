package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;

import java.time.LocalDateTime;

public class MakeShopAccount {//상점 계정 생성(만들기)
    @Getter
    @Setter
    public static class Request{//생성 요청
        private Long shopID;//상점 ID
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id//생성 결과
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long shopNumber;//상점 번호
        private String shopName;//상점 이름
        private Long shopPhoneNumber;//상점 전화 번호
        private String shopPosition;//상점 위치

        private String shopDetail;//삼정 설명
        private String menu1;//메뉴1
        private String menu2;//메뉴2
        private String table1;//상점 내 테이블1
        private String table2;//상점 내 테이블2
        private LocalDateTime localDateTime1;//사용 가능 시간1
        //private LocalDateTime localDateTime2;//사용 가능 시간2
        private LocalDateTime arriveTime;//도착 시간
    }}