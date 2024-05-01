package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;


public class MakeSellerAccount {//점장(판매자) 계정 만들기
    @Getter
    @Setter
    public static class Request{
        private Long sID;//판매자
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id //생성 결과
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long sNumber;//점장 번호
        private String sName;//점장 이름
        private Long sPW;//점장 PW
        private Long sPhoneNumber;//점장 전화번호
    }}