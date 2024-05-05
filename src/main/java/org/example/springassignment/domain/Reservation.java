package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ReservationRegister;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Reservation extends BaseEntity{@Id//예약
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rsNumber;//예약 번호
    private Long cID;//소비자 ID
    private Long cName;//소비자 이름
    private Long cPhoneNumber;//소비자 전화번호
    private Long rsDate;//예약 날짜
    private Long rsTime;//예약 시간
    private String menu;//예약 물건

public void rsChange(ReservationRegister rsRegister){//예약 정보 수정 형식
        this.rsDate=rsRegister.getRsDate();
        this.rsTime=rsRegister.getRsTime();
        this.menu=rsRegister.getMenu();
    }}