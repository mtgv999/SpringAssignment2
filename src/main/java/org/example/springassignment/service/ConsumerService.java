package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.login.ConsumerLoginRequest;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.repository.ConsumerRepository;
import org.example.springassignment.requestnResponse.MakeConsumerAccount;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ConsumerService {
    private final ConsumerRepository consumerRepository;
    public Consumer makeConsumer(ConsumerRegister cRegister){
        return consumerRepository.save(ConsumerRegister.cForm(cRegister));}

@Transactional public Consumer getConsumer(Long cID){
        return consumerRepository.findById(cID).get();}//[2][3]

    public Consumer changeConsumer
            (Long cID, ConsumerRegister cRegister) {
        Consumer saved=consumerRepository.findBycID(cID);
        saved.cChange(cRegister);return saved;}

    public void deleteConsumer(Long cID) {
        consumerRepository.deleteBycID(cID);}

    public String cLogin(ConsumerLoginRequest cLReq) {
Consumer reqCo=consumerRepository.findBycName(cLReq.getCName());
if(reqCo.getCPW().longValue()==cLReq.getCPW())
    return "Success!";else return "Fail!";}


}