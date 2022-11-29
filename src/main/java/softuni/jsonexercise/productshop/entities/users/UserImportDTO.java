package softuni.jsonexercise.productshop.entities.users;

import lombok.Getter;
import lombok.Setter;

import static softuni.jsonexercise.productshop.constants.messages.AGE_VALIDATOR;
import static softuni.jsonexercise.productshop.constants.messages.NAME_VALIDATOR;

@Getter
@Setter

public class UserImportDTO {


    private String firstName;
    private String lastName;
    private int age;





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
