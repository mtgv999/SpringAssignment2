package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Review;
import org.example.springassignment.register.ReviewRegister;
import org.example.springassignment.repository.ReviewRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {//리뷰
    private final ReviewRepository reviewRepository;

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
