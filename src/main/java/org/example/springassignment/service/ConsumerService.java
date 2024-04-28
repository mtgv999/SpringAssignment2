package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.repository.ConsumerRegisterRepository;
import org.example.springassignment.repository.ConsumerRepository;
import org.example.springassignment.requestnResponse.CreateConsumer;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    private final ConsumerRegisterRepository consumerRegisterRepository;
    public ConsumerRegister createConsumer(Long cID){
        return consumerRegisterRepository.findBycID(cID);}

    public Consumer getConsumer(Long cID){
        return consumerRepository.findBycID(cID);}//[2][3]

    public Consumer changeConsumer
            (Long cID, CreateConsumer.Response cCResponse) {
        Consumer saved=consumerRepository.findBycID(cID);
        saved.cChange(cCResponse);return saved;}

    public void deleteConsumer(Long cID) {
        consumerRepository.deleteBycID(cID);}
}