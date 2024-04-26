package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.repository.ConsumerRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    public Consumer createConsumer(Long cID){
        return consumerRepository.findBycID(cID);}
    public Consumer getConsumer(Long cID){
        return consumerRepository.findBycID(cID);}
}
