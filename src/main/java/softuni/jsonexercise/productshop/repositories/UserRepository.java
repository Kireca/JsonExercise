package softuni.jsonexercise.productshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.jsonexercise.productshop.entities.users.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}
