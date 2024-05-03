//package org.example.springassignment.service;
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//import org.example.springassignment.domain.Seller2;
//import org.example.springassignment.login.SellerLoginRequest2;
//import org.example.springassignment.register.SellerRegister2;
//import org.example.springassignment.repository.SellerRepository2;
//import org.springframework.stereotype.Service;
//@Service
//@Transactional
//@RequiredArgsConstructor
//public class SellerService2 {
//    private final SellerRepository2 sellerRepository;
//
//    public Seller2 makeSeller(SellerRegister2 sRegister){
//        return sellerRepository.save(SellerRegister2.sForm(sRegister));}
//
//    public Seller2 getSeller(Long sID){
//        return sellerRepository.findBysID(sID);}//[2][3]
//
//    public Seller2 changeSeller(Long sID, SellerRegister2 sRegister){
//        Seller2 saved= sellerRepository.findBysID(sID);
//        saved.sChange(sRegister);return saved;}
//
//    public void deleteSeller(Long sID) {
//        sellerRepository.deleteBysID(sID);}
//
//    public String sLogin(SellerLoginRequest2 sLReq) {
//        Seller2 reqSe= sellerRepository.findBysName(sLReq.getSName());
//        if(reqSe.getSPW().longValue()==sLReq.getSPW())
//            return "Success!";else return "Fail!";}}