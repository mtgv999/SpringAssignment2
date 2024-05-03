//package org.example.springassignment.controller;
//import lombok.RequiredArgsConstructor;
//import org.example.springassignment.domain.Seller2;
//import org.example.springassignment.login.SellerLoginRequest2;
//import org.example.springassignment.register.SellerRegister2;
//import org.example.springassignment.service.SellerService2;
//import org.springframework.web.bind.annotation.*;
//@RestController
//@RequestMapping("/seller")
//@RequiredArgsConstructor
//
//public class SellerController2 {//점장(판매자)
//    private final SellerService2 sellerService;
//    @PostMapping("/make")//점장 계정 만듬.
//    public Seller2 makeSeller(@RequestBody SellerRegister2 sRegister){
//        return sellerService.makeSeller(sRegister);}
//
//    @GetMapping("/get/{sID}")//점장 정보 가져옴.
//    public Seller2 getSeller(@PathVariable Long sID){
//        return sellerService.getSeller(sID);}//[2][3][4]
//
//    @PutMapping("/change/{sID}")//점장 정보 수정
//    public Seller2 changeSeller(@PathVariable Long sID,
//                                @RequestBody SellerRegister2 sRegister){
//        return sellerService.changeSeller(sID,sRegister);}
//
//    @DeleteMapping("/delete/{sID}")//점장 계정 삭제
//    public void deleteSeller(@PathVariable Long sID){
//        sellerService.deleteSeller(sID);}
//
//    @PostMapping("/sLogin")// 점장이 회원 가입을
//    // 했는지의 여부를 로그인을 통해 확인하려는 요청
//    public String sLogin(@RequestBody SellerLoginRequest2 sLReq){
//        return sellerService.sLogin(sLReq);}
//}