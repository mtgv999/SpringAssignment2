package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Review;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewRegister {//리뷰 등록
    private Long cID;//소비자 아이디
    private String review;//리뷰 내용

public static Review rvForm(ReviewRegister rvRegister){//리뷰 등록 형식
    return Review.builder().cID(rvRegister.getCID())
            .review(rvRegister.getReview()).build();}}