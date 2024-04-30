package org.example.springassignment.login;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerLoginRequest {
    @JsonProperty
    private String cName;
    @JsonProperty
    private Long cPW;
}
