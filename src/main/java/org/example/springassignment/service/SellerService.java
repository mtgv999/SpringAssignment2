package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.login.SellerLoginRequest;
import org.example.springassignment.register.SellerRegister;
import org.example.springassignment.repository.SellerRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;

    public Seller makeSeller(SellerRegister sRegister) {
        return sellerRepository.save(SellerRegister.sForm(sRegister));}

    public Seller getSeller(Long sID) {
        return sellerRepository.findBysID(sID);}

    public Seller changeSeller(Long sID, SellerRegister sRegister) {
        Seller saved=sellerRepository.findBysID(sID);
        saved.sChange(sRegister);return saved;}

    public void deleteSeller(Long sID){
        sellerRepository.deleteBysID(sID);}

    public String sLogin(SellerLoginRequest sLReq){
        Seller reqSe=sellerRepository.findBySName(sLReq.getSName());
        if(reqSe.getSPW().longValue()==sLReq.getSPW())
            return "Success!";else return "Fail!";}
}