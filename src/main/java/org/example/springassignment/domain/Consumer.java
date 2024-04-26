package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Consumer {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;//소비자 아이디
    private String cName;//소비자 이름
    private Long cPW;//소비자 비밀번호
    private boolean used;//소비자의 사용 여부

}