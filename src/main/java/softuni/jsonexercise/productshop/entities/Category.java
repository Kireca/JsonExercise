package softuni.jsonexercise.productshop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor


@Entity(name = "categories")
public class Category extends BaseEntity {


    @Column(nullable = false, length = 15)
    private String name;

    public Category(String name) {
        this.name = name;
    }
}
