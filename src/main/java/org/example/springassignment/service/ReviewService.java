package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.domain.Review;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.loginorcheck.SellerLoginRequest;
import org.example.springassignment.register.ReviewRegister;
import org.example.springassignment.repository.ConsumerRepository;
import org.example.springassignment.repository.ReviewRepository;
import org.example.springassignment.repository.SellerRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {//리뷰
    private final ReviewRepository reviewRepository;
    private final ConsumerRepository consumerRepository;
    private final SellerRepository sellerRepository;

    public String cLogin(ConsumerLoginRequest cLReq){
        Consumer reqCo=consumerRepository.findBycID
                (cLReq.getCID());//소비자 인지 아닌지 여부
        if(reqCo.getCPW().longValue()==cLReq.getCPW())
        {return "Success!";}else return "Fail!";}

    public String sLogin(SellerLoginRequest sLReq){
        Seller reqSe=sellerRepository.findBysID
                (sLReq.getSID());//점장 인지 아닌지 여부
        if(reqSe.getSPW().longValue()==sLReq.getSPW())
        {return "Success!";}else return "Fail!";}

    public Review makeReview(ReviewRegister rvRegister) {
    return reviewRepository.save(ReviewRegister.rvForm(rvRegister));}

    public Review getReview(Long rvNumber) {
        return reviewRepository.findByRvNumber(rvNumber);}

    public Review changeReview(Long rvNumber, ReviewRegister rvRegister) {
        Review saved=reviewRepository.findByRvNumber(rvNumber);
        saved.rvChange(rvRegister);return saved;}

    public void deleteReview(Long rvNumber) {
        reviewRepository.deleteByRvNumber(rvNumber);}
}
