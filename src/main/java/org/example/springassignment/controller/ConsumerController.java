package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.service.ConsumerService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor

public class ConsumerController {//소비자
    private final ConsumerService consumerService;

    @PostMapping("/make")//소비자 계정 만듬.(소비자 회원 가입)
    //계정 만들 때 makeReservation, used, review="no"로 설정 부탁
public Consumer makeConsumer(@RequestBody ConsumerRegister cRegister){
    return consumerService.makeConsumer(cRegister);}

    @GetMapping("/get/{cID}")//소비자 정보 가져옴.(검색 기능)
        public Consumer getConsumer(@PathVariable Long cID){
            return consumerService.getConsumer(cID);}//[2][3][4]

    @PutMapping("/change/{cID}")//소비자 정보 수정
    public Consumer changeConsumer(@PathVariable Long cID,
        @RequestBody ConsumerRegister cRegister){
        return consumerService.changeConsumer(cID,cRegister);}

    @DeleteMapping("/delete/{cID}")//소비자 계정
    public void deleteConsumer(@PathVariable Long cID){
        consumerService.deleteConsumer(cID);}

    @PostMapping("/cLogin")// 소비자가 회원 가입을 했는지의 여부를
    // 로그인(점장 번호, PW 확인)을 통해 확인하려는 요청 "cLogin" 결과가
    // "Success" 뜰때만, 예약을 만들고, 정보 가져오고, 수정하고 삭제 해야 됨.
    public String cCLogin(@RequestBody ConsumerLoginRequest cLReq){
        return consumerService.cCLogin(cLReq);}

    @PutMapping("/reservation/{cID}")
    public Consumer cMakeReservation(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister2) {//[5] 예약 하기
        return consumerService.cMakeReservation(cID,cRegister2);}

    @PutMapping("/used/{cID}")
    public Consumer cCheckUsed(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister3) {//사용 여부 바꿈
        return consumerService.cCheckUsed(cID,cRegister3);}

    @PutMapping("/make/review/{cID}")
    public Consumer cMakeReview(@PathVariable Long cID,
    @RequestBody ConsumerRegister cRegister4) {
        //예약, 사용 여부 에서 "Yes" 할 때만 리뷰 만들기
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