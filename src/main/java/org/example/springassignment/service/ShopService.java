package org.example.springassignment.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.springassignment.domain.Shop;
import org.example.springassignment.register.ShopRegister;
import org.example.springassignment.repository.ShopRepository;
import org.springframework.stereotype.Service;
@Service
@Transactional
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;

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