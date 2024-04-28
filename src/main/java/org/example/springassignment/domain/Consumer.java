package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ConsumerRegister;
import org.example.springassignment.requestnResponse.CreateConsumer;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Consumer extends BaseEntity { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;//소비자 아이디
    private Long cNumber;//소비자 번호
    private String cName;//소비자 이름
    private Long cPW;//소비자 비밀번호
    private Long cPhoneNumber;//소비자 전화번호
    private String used;//소비자의 사용 여부(리뷰 사용 위한)
    private String review;//소비자의 리뷰

    public void cChange(CreateConsumer.Response cCResponse) {
        this.cName =cCResponse.getCName();
        this.cPW = cCResponse.getCPW();
        this.cPhoneNumber = cCResponse.getCPhoneNumber();
        this.used = cCResponse.getUsed();
        this.review = cCResponse.getReview();}}//[2][3]