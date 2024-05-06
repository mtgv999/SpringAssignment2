package org.example.springassignment.domain;
import jakarta.persistence.*;
import lombok.*;
import org.example.springassignment.register.ShopRegister;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Shop extends BaseEntity{@Id//상점
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopID;//상점 ID
    private Long shopNumber;//상점 번호
    private String shopName;//상점 이름
    private Long shopPhoneNumber;//상점 전화 번호
    private String shopPosition;//상점 위치
    private String shopDetail;//상점 설명
    private Long sID;//점장 ID

    private String menu1;//메뉴1
    private String menu2;//메뉴2
    private String table1;//상점 내 테이블1
    private String table2;//상점 내 테이블2
    private LocalDateTime localDateTime1;//사용 가능 시간1
    private LocalDateTime localDateTime2;//사용 가능 시간2
    private LocalDateTime arriveTime;//도착 시간

    public void shopChange(ShopRegister shopRegister){//상점 정보 수정 양식
        this.shopNumber=shopRegister.getShopNumber();
        this.shopName=shopRegister.getShopName();
        this.shopPhoneNumber=shopRegister.getShopPhoneNumber();
        this.shopPosition=shopRegister.getShopPosition();
        this.shopDetail=shopRegister.getShopDetail();
        this.sID=shopRegister.getSID();

        this.menu1=shopRegister.getMenu1();
        this.menu2=shopRegister.getMenu2();
        this.table1=shopRegister.getTable1();
        this.table2=shopRegister.getTable2();
        this.localDateTime1=shopRegister.getLocalDateTime1();
        this.localDateTime2=shopRegister.getLocalDateTime2();
        this.arriveTime=shopRegister.getArriveTime();
    }}