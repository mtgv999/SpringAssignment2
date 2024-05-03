package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.login.ConsumerLoginRequest;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.service.ConsumerService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor

public class ConsumerController {
    private final ConsumerService consumerService;
    @PostMapping("/make")//소비자 계정 만듬.
    public Consumer makeConsumer(@RequestBody ConsumerRegister cRegister){
return consumerService.makeConsumer(cRegister);}

    @GetMapping("/get/{cID}")//소비자 정보 가져옴.
    public Consumer getConsumer(@PathVariable Long cID){
        return consumerService.getConsumer(cID);}//[2][3][4]

    @PutMapping("/change/{cID}")//소비자 정보 수정
    public Consumer changeConsumer(@PathVariable Long cID,
        @RequestBody ConsumerRegister cRegister){
        return consumerService.changeConsumer(cID,cRegister);}

    @DeleteMapping("/delete/{cID}")//소비자 계정 삭제
    public void deleteConsumer(@PathVariable Long cID){
        consumerService.deleteConsumer(cID);}

    @PostMapping("/cLogin")// 소비자가 회원 가입을
    // 했는지의 여부를 로그인을 통해 확인하려는 요청
public String cLogin(@RequestBody ConsumerLoginRequest cLReq){
        return consumerService.cLogin(cLReq);}

    //@PostMapping("/create/review")//리뷰 만듬.
    //public String makeReview(@RequestBody ConsumerLoginRequest cLReq){
    //    return consumerService.makeReview(cLReq);}

    //@PutMapping("/change/{cID}/review")//리뷰 수정
    //public Consumer changeReview(@PathVariable String review){}

    //@DeleteMapping("delete/{cID}/review")//리뷰 삭제
    //public void deleteReview(@PathVariable String review){
    //    consumerService.deleteReview(review);}
}