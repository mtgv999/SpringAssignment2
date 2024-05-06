package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Seller;
import org.example.springassignment.domain.Shop;

import org.example.springassignment.loginorcheck.SellerLoginRequest;
import org.example.springassignment.register.ShopRegister;
import org.example.springassignment.repository.SellerRepository;
import org.example.springassignment.repository.ShopRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;
    private final SellerRepository sellerRepository;

    public String sLogin(SellerLoginRequest sLReq){
        Seller reqSe=sellerRepository.findBysID(sLReq.getSID());//점장 인지 아닌지 여부
        if(reqSe.getSPW().longValue()==sLReq.getSPW())
        {return "Success!";}else return "Fail!";}

    public Shop makeShop(ShopRegister shopRegister){
        return shopRepository.save(ShopRegister.shopForm(shopRegister));}

    public Shop getShop(Long shopID){
        return shopRepository.findByShopID(shopID);}

    public Shop changeShop(Long shopID, ShopRegister shopRegister){
        Shop saved=shopRepository.findByShopID(shopID);
        saved.shopChange(shopRegister);return saved;}

    public void deleteShop(Long shopID){
        shopRepository.deleteByShopID(shopID);}
}