package org.example.springassignment.loginorcheck;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SellerLoginRequest {//점장 로그인 확인 요청
    @JsonProperty
    private Long sID;
    @JsonProperty
    private Long sPW;
}
