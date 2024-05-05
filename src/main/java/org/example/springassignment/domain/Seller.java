package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.SellerRegister;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Seller extends BaseEntity {@Id//판매자(점장)
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sID;//점장 ID
    private Long sNumber;//점장 번호
    private String sName;//점장 이름
    private Long sPW;//점장 PW
    private Long sPhoneNumber;//점장 전화번호

    public void sChange(SellerRegister sRegister){//점장 정보 수정 형식
        this.sNumber=sRegister.getSNumber();
        this.sName=sRegister.getSName();
        this.sPW=sRegister.getSPW();
        this.sPhoneNumber=sRegister.getSPhoneNumber();}}