package softuni.jsonexercise.productshop.services.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.jsonexercise.productshop.entities.categories.CategoryStats;
import softuni.jsonexercise.productshop.entities.products.ProductWithoutBuyerDTO;
import softuni.jsonexercise.productshop.repositories.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductWithoutBuyerDTO> getProductsInPriceRangeForSell(float from, float to) {
        BigDecimal rangeStart = BigDecimal.valueOf(from);
        BigDecimal rangeEnd = BigDecimal.valueOf(to);

        return this.productRepository.findAllByPriceBetween_And_BuyerIsNull_OrderByPrice(rangeStart, rangeEnd);
    }

    @Override
    public List<CategoryStats> getCategoryStatistics() {

       return this.productRepository.getCategoryStats();


    }
}
