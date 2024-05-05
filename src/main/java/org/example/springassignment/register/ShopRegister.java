package org.example.springassignment.register;
import lombok.*;
import org.example.springassignment.domain.Shop;
import java.time.LocalDateTime;
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopRegister {//상점 등록
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

    public static Shop shopForm
            (ShopRegister shopRegister){//상점 만드는 양식
        return Shop.builder()
                .shopNumber(shopRegister.getShopNumber())
                .shopName(shopRegister.getShopName())
                .shopPhoneNumber(shopRegister.getShopPhoneNumber())
                .shopPosition(shopRegister.getShopPosition())
                .shopDetail(shopRegister.getShopDetail())
                .sID(shopRegister.getSID())

                .menu1(shopRegister.getMenu1())
                .menu2(shopRegister.getMenu2())
                .table1(shopRegister.getTable1())
                .table2(shopRegister.getTable2())
                .localDateTime1(shopRegister.getLocalDateTime1())
                .localDateTime2(shopRegister.getLocalDateTime2())
                .arriveTime(shopRegister.getArriveTime()).build();}}