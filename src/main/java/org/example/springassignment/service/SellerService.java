package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.loginorcheck.SellerLoginRequest;
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
        Seller saved = sellerRepository.findBysID(sID);
        saved.sChange(sRegister);return saved;}

    public void deleteSeller(Long sID) {
        sellerRepository.deleteBysID(sID);}

    public String sLogin(SellerLoginRequest sLReq2){
        Seller reqSe=sellerRepository.findBysID(sLReq2.getSID());
        if(reqSe.getSPW().longValue()==sLReq2.getSPW())
            //점장 인지 아닌지 여부를 점장 번호, PW를 통해 확인
        {return "Success!";}else return "Fail!";}

     /* public void sDeleteReview(SellerLoginRequest sLReq3, Long sID){
        Seller reqSe2=sellerRepository.findBysID(sLReq3.getSNumber());
        if(reqSe2.getSPW().longValue()==sLReq3.getSPW())
            sellerRepository.deleteBysID(sID);} */
}