package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Shop;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopRegister {//상점 등록
    private Long shopNumber;//매장 번호
    private String shopName;//매장 이름
    private Long shopPhoneNumber;//매장 전화 번호
    private String shopPosition;//매장 위치

    private String shopDetail;//매장 설명
    private String menu1;//메뉴1
    private String menu2;//메뉴2
    private String menu3;//메뉴3

    public static Shop shopForm(ShopRegister shopRegister){
        return Shop.builder()
                .shopNumber(shopRegister.getShopNumber())
                .shopName(shopRegister.getShopName())
                .shopPhoneNumber(shopRegister.getShopPhoneNumber())
                .shopPosition(shopRegister.getShopPosition())

                .shopDetail(shopRegister.getShopDetail())
                .menu1(shopRegister.getMenu1())
                .menu2(shopRegister.getMenu2())
                .menu3(shopRegister.getMenu3()).build();}}