package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ConsumerRegister;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Consumer extends BaseEntity { @Id//소비자
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;//소비자 아이디
    private Long cNumber;//소비자 번호
    private String cName;//소비자 이름
    private Long cPW;//소비자 비밀번호
    private Long cPhoneNumber;//소비자 전화번호
    private String used;//소비자의 사용 여부(리뷰 사용 위한)
    private String review;//소비자의 리뷰

    public void cChange(ConsumerRegister cRegister) {
        this.cName =cRegister.getCName();
        this.cPW = cRegister.getCPW();
        this.cPhoneNumber = cRegister.getCPhoneNumber();
        this.used = cRegister.getUsed();
        this.review = cRegister.getReview();}}//[2][3]