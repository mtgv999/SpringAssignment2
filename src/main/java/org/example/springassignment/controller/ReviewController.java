package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Review;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.loginorcheck.SellerLoginRequest;
import org.example.springassignment.register.ReviewRegister;
import org.example.springassignment.service.ReviewService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/review")
@RequiredArgsConstructor

public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping("/cLogin")//소비자로서 회원 가입 했는지 여부를
    // 로그인을 통해 확인하려는 요청-> "cLogin" 결과가 "Success" 뜰 때만,
    // 리뷰를 만들고, 정보 가져오고, 수정하고 삭제할 수 있음.
    public String cLogin(@RequestBody ConsumerLoginRequest cLReq){
        return reviewService.cLogin(cLReq);}

    @PostMapping("/sLogin")//점장으로서 회원 가입 했는지 여부를 로그인을 통해
    // 확인하려는 요청-> "cLogin" 결과가 "Success" 뜰때만, 리뷰 삭제할 수 있음.
    public String sLogin(@RequestBody SellerLoginRequest sLReq){
        return reviewService.sLogin(sLReq);}

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