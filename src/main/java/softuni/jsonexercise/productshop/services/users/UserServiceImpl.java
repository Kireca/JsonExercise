package softuni.jsonexercise.productshop.services.users;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.jsonexercise.productshop.entities.users.User;
import softuni.jsonexercise.productshop.entities.users.UserWithSoldProductsDTO;
import softuni.jsonexercise.productshop.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    @Transactional
    public List<UserWithSoldProductsDTO> getUsersWithSoldProducts() {


        List<User> allWithSoldProducts = this.userRepository.findAllWithSoldProducts();

        return allWithSoldProducts
                .stream()
                .map(user -> this.modelMapper.map(user, UserWithSoldProductsDTO.class))
                .collect(Collectors.toList());


    }
}
