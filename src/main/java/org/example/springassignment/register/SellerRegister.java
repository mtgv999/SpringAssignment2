package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Seller;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerRegister{//판매자(점장) 등록
    private Long sNumber;//점장 번호
    private String sName;//점장 이름
    private Long sPW;//점장 비밀번호
    private Long sPhoneNumber;//점장 전화번호
    public static Seller sForm(SellerRegister sRegister){
        return Seller.builder()
                .sNumber(sRegister.getSNumber())
                .sName(sRegister.getSName())
                .sPW(sRegister.getSPW())
                .sPhoneNumber(sRegister.getSPhoneNumber()).build();}}