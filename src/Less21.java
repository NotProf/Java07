import lombok.*;

import java.util.Objects;

public class Less21 {
    public static void main(String[] args) {
        Person person_1 = new Person();
        System.out.println(person_1.toString());
    }
}

@Data
class Person {
    private String name;
    private int age;
    private String profession;
}