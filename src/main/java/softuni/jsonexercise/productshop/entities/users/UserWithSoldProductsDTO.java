package softuni.jsonexercise.productshop.entities.users;

import lombok.Getter;
import lombok.Setter;
import softuni.jsonexercise.productshop.entities.products.SoldProductDTO;

import java.util.List;

@Getter
@Setter
public class UserWithSoldProductsDTO {

    private String firstName;
    private String lastName;
    private List<SoldProductDTO> itemsBought;

}
