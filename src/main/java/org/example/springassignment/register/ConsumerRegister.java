package org.example.springassignment.register;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

    private String makeReservation="no";//예약
    private String used="no";//소비자의 사용 여부(리뷰 사용 위한)
    private String review="no";//소비자의 리뷰

public static Consumer cForm(ConsumerRegister cRegister){//소비자 등록 형식
        return Consumer.builder()
                .cNumber(cRegister.getCNumber())
                .cName(cRegister.getCName())
                .cPW(cRegister.getCPW())
    .cPhoneNumber(cRegister.getCPhoneNumber())

        .makeReservation(cRegister.getMakeReservation())
                .used(cRegister.getUsed())
                .review(cRegister.getReview()).build();}}//[3]