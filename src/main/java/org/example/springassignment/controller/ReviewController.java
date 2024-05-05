package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Review;
import org.example.springassignment.register.ReviewRegister;
import org.example.springassignment.service.ReviewService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor

public class ReviewController {
    private final ReviewService reviewService;
    @PostMapping("/make")//리뷰 만듬.
    public Review makeReview(@RequestBody ReviewRegister rvRegister){
        return reviewService.makeReview(rvRegister);}

    @GetMapping("/get/{rvNumber}")//리뷰 정보 가져옴.
    public Review getReview(@PathVariable Long rvNumber){
        return reviewService.getReview(rvNumber);}

    @PutMapping("/change/{rvNumber}")//리뷰 수정
    public Review changeReview(@PathVariable Long rvNumber,
        @RequestBody ReviewRegister rvRegister){
        return reviewService.changeReview(rvNumber,rvRegister);}

    @DeleteMapping("delete/{rvNumber}")//리뷰 삭제
    public void deleteReview(@PathVariable Long rvNumber){
        reviewService.deleteReview(rvNumber);}
}