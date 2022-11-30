package softuni.jsonexercise.productshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.jsonexercise.productshop.entities.categories.CategoryStats;
import softuni.jsonexercise.productshop.entities.products.Product;
import softuni.jsonexercise.productshop.entities.products.ProductWithoutBuyerDTO;

import java.math.BigDecimal;
import java.util.List;

import static softuni.jsonexercise.productshop.constants.query.FIND_ALL_BY_PRICE_BETWEEN;
import static softuni.jsonexercise.productshop.constants.query.GET_CATEGORY_STATS;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query(FIND_ALL_BY_PRICE_BETWEEN)
    List<ProductWithoutBuyerDTO> findAllByPriceBetween_And_BuyerIsNull_OrderByPrice(BigDecimal rangeStart, BigDecimal rangeEnd);


    @Query(GET_CATEGORY_STATS)
    List<CategoryStats> getCategoryStats();

}
