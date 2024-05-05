package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ReviewRegister;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Review extends BaseEntity{@Id//리뷰
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rvNumber;//리뷰 번호
    private Long cID;//소비자 아이디
    private Long sID;//점장 아이디
    private String review;//리뷰 내용

    public void rvChange(ReviewRegister rvRegister){//리뷰 정보 수정 형식
        this.review=rvRegister.getReview();}
}