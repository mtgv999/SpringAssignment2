package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;
import org.example.springassignment.register.ConsumerRegister;

public class MakeConsumerAccount {
    @Getter
    @Setter
    public static class Request{
        private Long cID;//소비자 ID
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long cNumber;//소비자 번호
        private String cName;//소비자 이름
        private Long cPW;//소비자 비밀번호
        private Long cPhoneNumber;//소비자 전화번호
        private String used;//소비자의 사용 여부(리뷰 사용 위한)
        private String review;//소비자의 리뷰

        public static Response cForm(ConsumerRegister cRegister){
            return Response.builder()
                    .cNumber(cRegister.getCNumber())
                    .cName(cRegister.getCName())
                    .cPW(cRegister.getCPW())
                    .used(cRegister.getUsed())
            .review(cRegister.getReview()).build();}}}//[2][3][4]