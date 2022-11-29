package softuni.jsonexercise.productshop.entities.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithoutBuyerDTO {


    private String name;
    private BigDecimal price;
    private String seller;



}
