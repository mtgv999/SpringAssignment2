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

public class ConsumerController {//소비자
    private final ConsumerService consumerService;
    @PostMapping("/make")//소비자 계정 만듬.(소비자 회원 가입)
public Consumer makeConsumer(@RequestBody ConsumerRegister cRegister){
    return consumerService.makeConsumer(cRegister);}

    @GetMapping("/get/{cID}")//소비자 정보 가져옴.(검색 기능)
        public Consumer getConsumer(@PathVariable Long cID){
            return consumerService.getConsumer(cID);}//[2][3][4]

    @PutMapping("/change/{cID}")//소비자 정보 수정
    public Consumer changeConsumer(@PathVariable Long cID,
        @RequestBody ConsumerRegister cRegister){
        return consumerService.changeConsumer(cID,cRegister);}

    @DeleteMapping("/delete/{cID}")//소비자 계정 삭제-
    //소비자의 ID, PW 확인 후 삭제
    public void deleteConsumer(@RequestBody ConsumerLoginRequest cLReq,
        @PathVariable Long cID){
        consumerService.deleteConsumer(cLReq,cID);}

    @PostMapping("/cLogin")// 소비자가 회원 가입을
    // 했는지의 여부를 로그인을 통해 확인하려는 요청
    public String cCLogin(@RequestBody ConsumerLoginRequest cLReq){
        return consumerService.cCLogin(cLReq);}

    @PutMapping("/reservation/{cID}")
    public Consumer cMakeReservation(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister2) {//[5] 예약하기
        return consumerService.cMakeReservation(cID,cRegister2);}

    @PutMapping("/used/{cID}")
    public Consumer cCheckUsed(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister3) {//사용 여부 바꿈.
        return consumerService.cCheckUsed(cID,cRegister3);}

    @PutMapping("/make/review/{cID}")
    public Consumer cMakeReview(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister4) {//리뷰 만들기
        return consumerService.cMakeReview(cID,cRegister4);}

    @PutMapping("/change/{cID}/review")//리뷰 수정
    public Consumer cChangeReview(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister5){
        return consumerService.cChangeReview(cID,cRegister5);}

    @PutMapping("delete/{cID}/review")//리뷰 삭제
    public Consumer cDeleteReview(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister6){
        return consumerService.cDeleteReview(cID,cRegister6);}
    }