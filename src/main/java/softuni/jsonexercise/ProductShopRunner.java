package softuni.jsonexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.jsonexercise.productshop.services.products.ProductService;
import softuni.jsonexercise.productshop.services.seeds.SeedService;

import java.math.BigDecimal;

@Component
public class ProductShopRunner implements CommandLineRunner {


    private final SeedService seedService;
    private final ProductService productService;

    @Autowired
    public ProductShopRunner(SeedService seedService, ProductService productService) {
        this.seedService = seedService;
        this.productService = productService;
    }


    @Override
    public void run(String... args) throws Exception {
//seedService.seedAll();

        this.productService.getProductsInPriceRangeForSell(500,1000);

        //TODO end!
    }
}
