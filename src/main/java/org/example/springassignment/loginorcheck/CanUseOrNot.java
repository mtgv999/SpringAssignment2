package org.example.springassignment.loginorcheck;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CanUseOrNot {
    //식사할 수 있는지 여부(예약보다 10분 전 먼저 도착)
    @JsonProperty
    private LocalDateTime rsTime;//예약 시간
    @JsonProperty
    private LocalDateTime arriveTime;//도착 시간
}