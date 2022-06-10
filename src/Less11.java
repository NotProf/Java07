//import java.util.Objects;
//import java.util.regex.*;
//public class Less11 {
//    public static void main(String[] args) {
//
//        String str = "test123";
//        String s = str.replaceAll("[0-3]", "0");
//        System.out.println(s);
//
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//    private String email;
//    private String phone;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&
//                Objects.equals(name, person.name) &&
//                Objects.equals(email, person.email) &&
//                Objects.equals(phone, person.phone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, email, phone);
//    }
//}