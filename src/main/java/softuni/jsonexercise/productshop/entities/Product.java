package softuni.jsonexercise.productshop.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static softuni.jsonexercise.productshop.constants.messages.NAME_VALIDATOR;

@Getter
@Setter


@Entity(name = "products")

public class Product extends BaseEntity {


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne
    private User buyer;

    @ManyToOne
    private User seller;

    @ManyToMany
    private Set<Category> categories;

    public Product() {
        this.categories = new HashSet<>();
    }

    public Product(String name, BigDecimal price) {
        this();
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException(NAME_VALIDATOR);
        }
        this.name = name;
    }
}
