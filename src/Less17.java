//import java.util.Comparator;
//
//public class Less17 {
//    public static void main(String[] args) {
//        Comparator<User> comparatorByAge = ComparatorCreator.createComparatorByAge();
//    }
//}
//
//class User {
//    public String name;
//    public Integer age;
//    public String email;
//}
//
//class CompareByName implements Comparator<User> {
//
//    @Override
//    public int compare(User o1, User o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}
//
//class CompareByAge implements Comparator<User> {
//
//    @Override
//    public int compare(User o1, User o2) {
//        return o1.age.compareTo(o2.age);
//    }
//}
//
//class CompareByEmail implements Comparator<User> {
//
//    @Override
//    public int compare(User o1, User o2) {
//        return o1.email.compareTo(o2.email);
//    }
//}
//
//class ComparatorCreator {
//
//    public static Comparator<User> createComparatorByName() {
//        return new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
//    }
//
//    public static Comparator<User> createComparatorByAge() {
//        return new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.age.compareTo(o2.age);
//            }
//        };
//    }
//
//    public static Comparator<User> createComparatorByEmail() {
//        return new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.email.compareTo(o2.email);
//            }
//        };
//    }
//}
