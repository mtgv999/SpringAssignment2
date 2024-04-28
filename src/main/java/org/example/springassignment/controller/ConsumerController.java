package org.example.springassignment.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.service.ConsumerService;
import org.example.springassignment.requestnResponse.CreateConsumer;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class ConsumerController {
    private final ConsumerService consumerService;
    @PostMapping("/create")//소비자 계정 만듬.
    public CreateConsumer.Response createConsumer
    (@RequestBody @Valid CreateConsumer.Request cRequest){
return CreateConsumer.Response.cForm
        (consumerService.createConsumer(cRequest.getCID()));}

    @GetMapping("/get/{cID}")//소비자 정보 가져옴.
    public Consumer getConsumer(@PathVariable Long cID){
        return consumerService.getConsumer(cID);}//[2][3][4]

    @PutMapping("/change/{cID}")//소비자 정보 수정
    public Consumer changeConsumer(@PathVariable Long cID,
        @RequestBody CreateConsumer.Response cCResponse){
        return consumerService.changeConsumer(cID,cCResponse);}

    @DeleteMapping("/delete/{cID}")//소비자 계정 삭제
    public void deleteConsumer(@PathVariable Long cID){
        consumerService.deleteConsumer(cID);}

    /*@PostMapping("/create/review")//리뷰 만듬.


    @PutMapping("/change/{cID}/review")//리뷰 수정
    public Consumer changeReview(@PathVariable String review){

    }

    @DeleteMapping("delete/{cID}/review")//리뷰 삭제
    public void deleteReview(@PathVariable String review){
        consumerService.deleteReview(review);}*/

}