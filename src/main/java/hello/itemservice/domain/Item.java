package hello.itemservice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
//@Table(name = ) 같으면 생략 가능
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * length DDL(create table) 실행될 때 사용됨
     * itemName -> item_name : 생략가능
     */
    @Column(name="item_name", length = 10)
    private String itemName;

//    @Column 같으면 생략 가능능
    private Integer price;
    private Integer quantity;

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
