package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.loginorcheck.ConsumerLoginRequest;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ConsumerService {//소비자
    private final ConsumerRepository consumerRepository;

    public Consumer makeConsumer(ConsumerRegister cRegister){
        return consumerRepository.save(ConsumerRegister.cForm(cRegister));}

    public Consumer getConsumer(Long cID){
            return consumerRepository.findBycID(cID);}

    public Consumer changeConsumer(Long cID, ConsumerRegister cRegister){
            Consumer saved=consumerRepository.findBycID(cID);
            saved.cChange(cRegister);return saved;}

    public void deleteConsumer(Long cID) {
        consumerRepository.deleteBycID(cID);}

    public String cCLogin(ConsumerLoginRequest cLReq) {
        Consumer reqCo=consumerRepository.findBycID(cLReq.getCID());
        if(reqCo.getCPW().longValue()==cLReq.getCPW())
        //소비자 인지 아닌지 여부를 점장 번호, PW를 통해 확인
        {return "Success!";}else return "Fail!";}

    public Consumer cMakeReservation(Long cID,ConsumerRegister cRegister2){
        Consumer saved2= consumerRepository.findBycID(cID);
        saved2.cChange2(cRegister2);return saved2;}

    public Consumer cCheckUsed(Long cID,ConsumerRegister cRegister3){
        Consumer saved3= consumerRepository.findBycID(cID);
        saved3.cChange3(cRegister3);return saved3;}

    public Consumer cMakeReview(Long cID,ConsumerRegister cRegister4){
        Consumer saved4= consumerRepository.findBycID(cID);
        saved4.cChange4(cRegister4);return saved4;}

    public Consumer cChangeReview(Long cID, ConsumerRegister cRegister5){
        Consumer saved5=consumerRepository.findBycID(cID);
        saved5.cChange5(cRegister5);return saved5;}

    public Consumer cDeleteReview(Long cID, ConsumerRegister cRegister6){
        Consumer saved6=consumerRepository.findBycID(cID);
        saved6.cChange6(cRegister6);return saved6;}
}