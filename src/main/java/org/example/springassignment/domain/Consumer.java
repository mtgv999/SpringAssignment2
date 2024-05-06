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

    private String makeReservation;//예약
    private String used;//소비자의 사용 여부(리뷰 사용 위한)
    private String review;//소비자의 리뷰

    public void cChange(ConsumerRegister cRegister) {//소비자 정보 수정 형식
        this.cNumber=cRegister.getCNumber();
        this.cName =cRegister.getCName();
        this.cPW = cRegister.getCPW();
        this.cPhoneNumber = cRegister.getCPhoneNumber();}//[2][3]

    public void cChange2(ConsumerRegister cRegister2){
        //예약 사용 여부 바꿈(No->Yes)
        this.makeReservation="yes";}

    public void cChange3(ConsumerRegister cRegister3){
        //매장 사용 여부 바꿈(No->Yes)
        this.used = "yes";}

    public void cChange4(ConsumerRegister cRegister4){
        //리뷰 사용할 수 있게 함.(매장 사용 후)
        this.review = "yes";}

    public void cChange5(ConsumerRegister cRegister5){//리뷰 수정.
        this.review=cRegister5.getReview();}

    public void cChange6(ConsumerRegister cRegister6) {//리뷰 삭제
        this.review="no";}
}