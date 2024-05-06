package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ReservationRegister2;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Reservation2 extends BaseEntity{@Id//리뷰[5]
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rsNumber;//예약 번호
    private Long cID;//소비자 아이디
    private Long cNumber;//소비자 번호
    private Long cPhoneNumber;//소비자 전화번호

    //private Long rsDate;//예약 날짜
    private LocalDateTime rsTime;//예약 날짜+시간
    private String menu;//예약 메뉴
    private String tables;//예약 테이블

    public void rsChange(ReservationRegister2 rsRegister){//예약 정보 수정 형식
        //this.rsDate=rsRegister.getRsDate();
        this.rsTime=rsRegister.getRsTime();
        this.menu=rsRegister.getMenu();
        this.tables=rsRegister.getTables();}}