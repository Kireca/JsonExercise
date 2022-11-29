package softuni.jsonexercise.productshop.entities.products;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class ProductImportDTO {

    private String name;

    private BigDecimal price;


}
