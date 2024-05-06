package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Reservation2;

import java.time.LocalDateTime;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRegister2 {//예약 등록
    private Long cID;//소비자 아이디
    private Long cNumber;//소비자 번호
    private Long cPhoneNumber;//소비자 전화번호

    //private Long rsDate;
    private LocalDateTime rsTime;//예약 날짜+시간[6]
    private String menu;//예약 메뉴
    private String tables;//예약 테이블

    public static Reservation2 rsForm
            (ReservationRegister2 rsRegister){
        return Reservation2.builder()
                .cID(rsRegister.getCID())
                .cNumber(rsRegister.getCNumber())
                .cPhoneNumber(rsRegister.getCPhoneNumber())

                //.rsDate(rsRegister.getRsDate())
                .rsTime(rsRegister.getRsTime())
                .menu(rsRegister.getMenu())
                .tables(rsRegister.getTables()).build();}}