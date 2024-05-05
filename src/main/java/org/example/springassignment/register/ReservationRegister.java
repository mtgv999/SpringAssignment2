package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Reservation;

import java.time.LocalDateTime;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRegister{//예약 등록
    private Long rsDate;//예약 날짜
    private Long cID;//소비자 ID

    private Long cPhoneNumber;//소비자 전화번호
    private Long rsTime;//예약 시간
    private String menu;//메뉴

    public static Reservation rsForm(ReservationRegister
              rsRegister){//예약 등록 형식
        return Reservation.builder()
                .rsDate(rsRegister.getRsDate())
                .cID(rsRegister.getCID())
                .cPhoneNumber(rsRegister.getCPhoneNumber())
                .rsTime(rsRegister.getRsTime())
                .menu(rsRegister.getMenu()).build();}
}