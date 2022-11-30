package softuni.jsonexercise.productshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.jsonexercise.productshop.entities.users.User;

import java.util.List;

import static softuni.jsonexercise.productshop.constants.query.FIND_ALL_WITH_SOLD_PRODUCTS;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(FIND_ALL_WITH_SOLD_PRODUCTS)
    List<User> findAllWithSoldProducts();
}
