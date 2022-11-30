package softuni.jsonexercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.jsonexercise.productshop.entities.categories.CategoryStats;
import softuni.jsonexercise.productshop.entities.products.ProductWithoutBuyerDTO;
import softuni.jsonexercise.productshop.entities.users.UserWithSoldProductsDTO;
import softuni.jsonexercise.productshop.services.products.ProductService;
import softuni.jsonexercise.productshop.services.seeds.SeedService;
import softuni.jsonexercise.productshop.services.users.UserService;

import java.util.List;

@Component
public class ProductShopRunner implements CommandLineRunner {


    private final SeedService seedService;
    private final ProductService productService;
    private final UserService userService;

    private final Gson gson;

    @Autowired
    public ProductShopRunner(SeedService seedService, ProductService productService, UserService userService) {
        this.seedService = seedService;
        this.productService = productService;
        this.userService = userService;
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }


    @Override
    public void run(String... args) throws Exception {
      // this.seedService.seedAll();
        //productsBetweenPriceWithoutBuyer();
       // getUsersWithSoldProducts();


        List<CategoryStats> categoryStatistics = this.productService.getCategoryStatistics();
        String json = this.gson.toJson(categoryStatistics);
        System.out.println(json);

        //END
    }

    private void getUsersWithSoldProducts() {
        List<UserWithSoldProductsDTO> usersWithSoldProducts = this.userService.getUsersWithSoldProducts();

        String json = gson.toJson(usersWithSoldProducts);
        System.out.println(json);
    }

    private void productsBetweenPriceWithoutBuyer() {
        List<ProductWithoutBuyerDTO> productsForSell = this.productService.getProductsInPriceRangeForSell(500, 1000);
        String json = this.gson.toJson(productsForSell);
        System.out.println(json);
    }
}
