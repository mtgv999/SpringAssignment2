package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.loginorcheck.SellerLoginRequest;
import org.example.springassignment.register.SellerRegister;
import org.example.springassignment.service.SellerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
@RequiredArgsConstructor

public class SellerController {
    private final SellerService sellerService;
    @PostMapping("/make")//점장(판매자) 계정 만듬.(점장 회원 가입)
    public Seller makeSeller(@RequestBody SellerRegister sRegister){
        return sellerService.makeSeller(sRegister);}

    @GetMapping("/get/{sID}")//점장 정보 가져옴.(검색 기능)
    public Seller getSeller(@PathVariable Long sID){
        return sellerService.getSeller(sID);}

    @PutMapping("/change/{sID}")//점장 정보 수정
    public Seller changeSeller(@PathVariable Long sID,
    @RequestBody SellerRegister sRegister){
        return sellerService.changeSeller(sID,sRegister);}

    @DeleteMapping("/delete/{sID}")//점장 계정 삭제-
    public void deleteSeller(@PathVariable Long sID){
        sellerService.deleteSeller(sID);}

    @PostMapping("/sLogin")// 점장이 회원 가입을
    // 했는지의 여부를 로그인(점장 번호, PW 확인)을 통해 확인하려는 요청
    public String sLogin(@RequestBody SellerLoginRequest sLReq2){
        return sellerService.sLogin(sLReq2);}

    /* @DeleteMapping("delete/{sID}/review")//리뷰 삭제
    public void sDeleteReview(@RequestBody SellerLoginRequest sLReq3,
                              @PathVariable Long sID){
        sellerService.sDeleteReview(sLReq3,sID);}*/
}