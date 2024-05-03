package org.example.springassignment.controller;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Shop;
import org.example.springassignment.register.ShopRegister;
import org.example.springassignment.service.ShopService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor

public class ShopController {//상점
    private final ShopService shopService;
    @PostMapping("/make")//계정 만듬.
    public Shop makeShop(@RequestBody ShopRegister shopRegister){
        return shopService.makeShop(shopRegister);}

    @GetMapping("/get/{shopID}")//정보 가져옴.
    public Shop getShop(@PathVariable Long shopID){
        return shopService.getShop(shopID);}

    @PutMapping("/change/{shopID}")//정보 수정
    public Shop changeShop(@PathVariable Long shopID,
                           @RequestBody ShopRegister shopRegister){
        return shopService.changeShop(shopID,shopRegister);}

    @DeleteMapping("/delete/{shopID}")
    public void deleteShop(@PathVariable Long shopID){
        shopService.deleteShop(shopID);}
}