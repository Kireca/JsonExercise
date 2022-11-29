package softuni.jsonexercise.productshop.entities.users;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import softuni.jsonexercise.productshop.entities.BaseEntity;
import softuni.jsonexercise.productshop.entities.products.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
        this.lastName = lastName;
        this.age = age;
    }
}
