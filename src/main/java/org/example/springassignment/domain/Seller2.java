//package org.example.springassignment.domain;
//import jakarta.persistence.*;
//import lombok.*;
//import org.example.springassignment.register.SellerRegister2;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//@Builder
//@Setter
//@Entity
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
//public class Seller2 extends BaseEntity { @Id//점장(판매자)
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long sID;//점장 아이디
//    private Long sNumber;//점장 번호
//    private String sName;//점장 이름
//    private Long sPW;//점장 비밀번호
//    private Long sPhoneNumber;//점장 전화번호
//
//    public void sChange(SellerRegister2 sRegister) {
//        this.sName =sRegister.getSName();
//        this.sPW = sRegister.getSPW();
//        this.sPhoneNumber = sRegister.getSPhoneNumber();}}//[2][3]