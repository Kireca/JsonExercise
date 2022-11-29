package softuni.jsonexercise.productshop.services.products;

import softuni.jsonexercise.productshop.entities.products.ProductWithoutBuyerDTO;

import java.util.List;

public interface ProductService {

    List<ProductWithoutBuyerDTO> getProductsInPriceRangeForSell(float from, float to);

}
