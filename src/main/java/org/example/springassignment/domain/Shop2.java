//package org.example.springassignment.domain;
//import jakarta.persistence.*;
//import lombok.*;
//import org.example.springassignment.register.ShopRegister;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//@Builder
//@Setter
//@Entity
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
//public class Shop extends BaseEntity { @Id//매장(상점)
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long shopID;//매장 ID
//    private Long shopNumber;//소비자 번호
//    private String shopName;//소비자 이름
//    private Long shopPhoneNumber;//소비자 전화번호
//    private String shopPosition;//매장 위치
//
//    private String shopDetail;//매장 설명
//    private String menu1;//메뉴1
//    private String menu2;//메뉴2
//    private String menu3;//메뉴2
//
//    public void shopChange(ShopRegister shopRegister) {
//        this.shopName = shopRegister.getShopName();
//        this.shopPhoneNumber = shopRegister.getShopPhoneNumber();
//        this.shopPosition = shopRegister.getShopPosition();
//
//        this.shopDetail = shopRegister.getShopDetail();
//        this.menu1 = shopRegister.getMenu1();
//        this.menu2 = shopRegister.getMenu2();
//        this.menu3 = shopRegister.getMenu3();}}//[2][3]