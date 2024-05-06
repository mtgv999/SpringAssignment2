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
    private Long sID;//점장 아이디
    private String review;//소비자 리뷰

public static Review rvForm(ReviewRegister rvRegister){//리뷰 등록 형식
    return Review.builder()
            .cID(rvRegister.getCID())
            .sID(rvRegister.getSID())
            .review(rvRegister.getReview()).build();}}