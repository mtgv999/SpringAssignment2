package org.example.springassignment.controller;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Consumer;
import org.example.springassignment.service.ConsumerService;
import org.example.springassignment.signup.CreateConsumer;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class ConsumerController {
    private final ConsumerService consumerService;
    @PostMapping("/create")
    public CreateConsumer.Response createConsumer(@RequestBody @Valid
    CreateConsumer.Request request){
        return CreateConsumer.Response.from(consumerService.
    }
    @GetMapping("/get/{cID}")
    public Consumer getConsumer(@PathVariable Long cID){
        return consumerService.getConsumer(cID);}
}
