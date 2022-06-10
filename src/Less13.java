//import java.security.cert.CollectionCertStoreParameters;
//import java.util.*;
//
//public class Less13 {
//    public static void main(String[] args) {
//        User[] dens = {new User("Jack", 20),
//                new User("Den", 25),
//                new User("Jack", 40)
//        };
//
//        List<User> dens1 = List.of(dens);
//
//        dens1.sort(new UserComparator());
//    }
//}
//
//class User {
//    public String name;
//    public Integer age;
//
//    public User(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//}
//
//class UserComparator implements Comparator<User> {
//
//    @Override
//    public int compare(User o1, User o2) {
//        int res = o1.name.compareTo(o2.name);
//        if (res == 0) {
//            res = o1.age.compareTo(o2.age);
//        }
//        return res;
//    }
//}