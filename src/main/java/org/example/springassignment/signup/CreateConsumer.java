package org.example.springassignment.signup;
import lombok.*;
import org.example.springassignment.domain.Consumer;
import java.time.LocalDateTime;
public class CreateConsumer {
    @Getter
    @Setter
    public static class Request{
        private Long cID;//소비자 ID
    }
    @Getter
    @Builder
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{
        private Long cID;//소비자 ID
        private Long cNumber;//소비자 번호
        private LocalDateTime madeAt;//ID 생성일
        private
        public static Response from(Consumer consumer){
            return Response.builder()
                    .cID(consumer.getCID())
                    .cNumber(consumer.g).build();}}}