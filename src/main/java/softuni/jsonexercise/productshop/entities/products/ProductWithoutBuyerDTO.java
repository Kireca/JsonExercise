package softuni.jsonexercise.productshop.entities.products;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter

@Setter
public class ProductWithoutBuyerDTO {

    private String name;
    private BigDecimal price;
    private String seller;


    public ProductWithoutBuyerDTO(String name, BigDecimal price,String firstName , String lastName) {
        this.name = name;
        this.price = price;
        this.seller = seller;

        if (firstName == null){
            this.seller = lastName;
        }else {
            this.seller = firstName + ' ' + lastName;
        }
    }
}
