package org.example.springassignment.login;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerLoginRequest {//소비자 로그인 확인 요청
    @JsonProperty
    private Long cID;
    @JsonProperty
    private Long cPW;}