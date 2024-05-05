package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.login.ConsumerLoginRequest;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.repository.ConsumerRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ConsumerService {//소비자
    private final ConsumerRepository consumerRepository;String c="";

    public Consumer makeConsumer(ConsumerRegister cRegister){
        return consumerRepository.save(ConsumerRegister.cForm(cRegister));}

    public Consumer getConsumer(Long cID){
            return consumerRepository.findBycID(cID);}

    //public Consumer getConsumer(Long cID){
    //            return consumerRepository.findBycID(cID);}

    public Consumer changeConsumer(Long cID, ConsumerRegister cRegister){
            Consumer saved=consumerRepository.findBycID(cID);
            saved.cChange(cRegister);return saved;}

    public void deleteConsumer(ConsumerLoginRequest cLReq,Long cID) {
        Consumer reqCo=consumerRepository.findBycID(cLReq.getCID());
if(reqCo.getCPW().longValue()==cLReq.getCPW())//소비자 인지 아닌지 여부 확인
        consumerRepository.deleteBycID(cID);}

//public void deleteConsumer(Long cID) {consumerRepository.deleteBycID(cID);}

    public String cLogin(ConsumerLoginRequest cLReq){
    Consumer reqCo=consumerRepository.findBycID
            (cLReq.getCID());c="";//소비자 인지 아닌지 여부
    if(reqCo.getCPW().longValue()==cLReq.getCPW())
        c="Success!";else c="Fail!";return c;}

    //public String cLogin(ConsumerLoginRequest cLReq){
    //    Consumer reqCo=consumerRepository.findBycName
    //            (cLReq.getCName());c="";//소비자 인지 아닌지 여부
    //    if(reqCo.getCPW().longValue()==cLReq.getCPW())
    //        c="Success!";else c="Fail!";return c;}

//public String makeReview(ConsumerLoginRequest cLReq){return null;}
}