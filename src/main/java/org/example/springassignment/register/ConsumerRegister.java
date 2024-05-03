package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Consumer;
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerRegister {//소비자 등록
    private Long cNumber;//소비자 번호
    private String cName;//소비자 이름
    private Long cPW;//소비자 비밀번호
    private Long cPhoneNumber;//소비자 전화번호
    private String used;
    private String review;

    public static Consumer cForm(ConsumerRegister cRegister){
        return Consumer.builder()
                .cNumber(cRegister.getCNumber())
                .cName(cRegister.getCName())
                .cPW(cRegister.getCPW())
    .cPhoneNumber(cRegister.getCPhoneNumber())
                .used(cRegister.getUsed())
    .review(cRegister.getReview()).build();}}//[3]