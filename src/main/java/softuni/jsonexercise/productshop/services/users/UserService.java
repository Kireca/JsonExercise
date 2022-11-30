package softuni.jsonexercise.productshop.services.users;

import softuni.jsonexercise.productshop.entities.users.UserWithSoldProductsDTO;

import java.util.List;

public interface UserService {
    List<UserWithSoldProductsDTO> getUsersWithSoldProducts();
}
