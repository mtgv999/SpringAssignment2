package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;

public class MakeConsumerAccount {//소비자 계정 생성(만들기)
    @Getter
    @Setter
    public static class Request{//생성 요청
        private Long cID;//예약 번호
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id//생성 결과
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long cNumber;//소비자 번호
        private String cName;//소비자 이름
        private Long cPW;//소비자 비밀번호
        private Long cPhoneNumber;//소비자 전화번호

        private String makeReservation;//예약
        private String used;//소비자의 사용 여부(리뷰 사용 위한)
        private String review;//소비자의 리뷰
    }}//[2][3][4]

        /* public static Response cForm(ConsumerRegister cRegister){
            return Response.builder()
                    .cNumber(cRegister.getCNumber())
                    .cName(cRegister.getCName())
                    .cPW(cRegister.getCPW())
                    .used(cRegister.getUsed())
            .review(cRegister.getReview()).build();}}}//[2][3][4]*/