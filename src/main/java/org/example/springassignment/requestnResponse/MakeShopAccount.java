package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;

public class MakeShopAccount {//매장(상점) 계정 생성(만들기)
    @Getter
    @Setter
    public static class Request{//생성 요청
        private Long shopID;//매장 ID
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id//생성 결과
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long shopNumber;//매장 번호
        private String shopName;//매장 이름
        private Long shopPhoneNumber;//매장 전화 번호
        private String shopPosition;//매장 위치

        private String shopDetail;//매장 설명
        private String menu1;//메뉴1
        private String menu2;//메뉴2
        private String menu3;//메뉴3
    }}