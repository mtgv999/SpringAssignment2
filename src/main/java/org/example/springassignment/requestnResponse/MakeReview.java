package org.example.springassignment.requestnResponse;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.springassignment.domain.BaseEntity;

public class MakeReview {//리뷰 생성(만들기)
    @Getter
    @Setter
    public static class Request {//생성 요청
        private Long rvNumber;//리뷰 번호

    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response extends BaseEntity{@Id//생성 결과
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long cID;//소비자 아이디
        private Long sID;//점장 아이디
        private String review;//리뷰 내용
    }}