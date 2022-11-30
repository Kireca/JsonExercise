package softuni.jsonexercise.productshop.entities.categories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CategoryStats {


    private String category;
    private long productCount;
    private double averagePrice;
    private BigDecimal totalRevenue;

    public CategoryStats(String category, long productCount, double averagePrice, BigDecimal totalRevenue) {
        this.category = category;
        this.productCount = productCount;
        this.averagePrice = averagePrice;
        this.totalRevenue = totalRevenue;
    }
}
