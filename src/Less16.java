//import java.lang.reflect.Field;
//
//public class Less16 {
//    public static void main(String[] args) throws IllegalAccessException {
//        Class<User> aClass = User.class;
//
//        Field[] declaredFields = aClass.getDeclaredFields();
//        User user = new User();
//        for (Field declaredField : declaredFields) {
//            // Important
//            declaredField.setAccessible(true);
//
//            Class<?> type = declaredField.getType();
//
//            if (declaredField.getType().toString().equals("class java.lang.String")) {
//                declaredField.set(user, "User");
//            }
//            if (declaredField.getType().toString().equals("int")) {
//                declaredField.set(user, 100);
//            }
//        }
//
//        for (Field declaredField : declaredFields) {
//            System.out.println("Field " + declaredField.getName() + " = " + declaredField.get(user));
//        }
//
//        System.out.println(user);
//    }
//
//    public static void printList(String name, Object[] objects) {
//        System.out.println(name);
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i].toString());
//        }
//    }
//}
//
//
//class User implements CanCall {
//    private String name;
//    private int age;
//    private String profession;
//
//    public User() {
//    }
//
//    public User(String name, int age, String profession) {
//        this.name = name;
//        this.age = age;
//        this.profession = profession;
//    }
//
//    public User(String name, String profession) {
//        this.name = name;
//        this.profession = profession;
//    }
//
//    public void test() {
//        System.out.println("Test - " + this.name + " ");
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
//    public String getProfession() {
//        return profession;
//    }
//
//    public void setProfession(String profession) {
//        this.profession = profession;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", profession='" + profession + '\'' +
//                '}';
//    }
//}
//
//interface CanCall {
//
//}