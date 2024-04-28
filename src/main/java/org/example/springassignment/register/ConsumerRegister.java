package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Consumer;
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerRegister{//소비자 등록
    private Long cID;//소비자 ID
    private Long cNumber;//소비자 번호
    private String cName;//소비자 이름
    private Long cPW;//소비자 비밀번호
    private Long cPhoneNumber;//소비자 전화번호
    private String used;
    private String review;
    public static ConsumerRegister cForm(Consumer consumer){
        return ConsumerRegister.builder()
                .cID(consumer.getCID())
                .cNumber(consumer.getCNumber())
                .cName(consumer.getCName())
                .cPW(consumer.getCPW())
    .cPhoneNumber(consumer.getCPhoneNumber())
                //.used(consumer.getUsed())
    //.review(consumer.getReview())
        .build();}}//[3]