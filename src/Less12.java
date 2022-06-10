//import java.util.*;
//
//public class Less12 {
//    public static void main(String[] args) {
//        List<User> list = new ArrayList<>();
//        list.add(new User(20));
//        list.add(new User(30));
//        list.add(new User(40));
//
//        Collections.sort(list);
//
//        for (User user : list) {
//            System.out.println(user);
//        }
//
//    }
//}
//class User implements Comparable<User> {
//    String name;
//    String email;
//    int age;
//
//    public User(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(User o) {
//        return o.age - this.age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}