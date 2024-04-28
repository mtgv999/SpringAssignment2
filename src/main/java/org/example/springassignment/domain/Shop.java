package org.example.springassignment.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Builder
@Setter
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Shop extends BaseEntity{@Id
    private Long shopId;//매장 ID
    private Long phoneNumber;//매장 전화 번호
    private String shopName;//매장 이름

    private String shopPosition;//상점 위치
    private String shopDetail;//상점 설명
    private String menu1;//메뉴1
    private String menu2;//메뉴2
    private String menu3;//메뉴3
}