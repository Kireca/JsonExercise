package softuni.jsonexercise.productshop.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static softuni.jsonexercise.productshop.constants.messages.AGE_VALIDATOR;
import static softuni.jsonexercise.productshop.constants.messages.NAME_VALIDATOR;

@Getter
@Setter


@Entity(name = "users")
public class User extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column
    private int age;

    @OneToMany(targetEntity = Product.class, mappedBy = "seller")
    private List<Product> sellingProducts;

    @OneToMany(targetEntity = Product.class, mappedBy = "buyer")
    private List<Product> productsBought;


    @ManyToMany
    private Set<User> friends;


    public User() {
        this.sellingProducts = new ArrayList<>();
        this.productsBought = new ArrayList<>();
        this.friends = new HashSet<>();
    }

    public User(String lastName, int age) {
        this();
        setLastName(lastName);
        setAge(age);
    }


    public User(String firstName, String lastName, int age) {
        this();
        this.firstName = firstName;
        setLastName(lastName);
        setAge(age);
    }

    public void setLastName(String lastName) {
        if (!(lastName.length() < 3)) {
            throw new IllegalArgumentException(NAME_VALIDATOR);
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(AGE_VALIDATOR);
        }
        this.age = age;
    }


}
