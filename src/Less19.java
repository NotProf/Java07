//import java.io.*;
//
////З файлу зчитати вік та ім’я, які відділені пробілом, створити клас Person ,
//// який має два поля : ім’я та вік. Записувати вік та ім’я з файлу в об’єкт типу Person.
//// Створений об’єкт записати у файл.
//
//public class Less19 {
//    public static final String PATH = "C:\\Logos\\Java07\\src\\1.txt";
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileReader fileReader = new FileReader(PATH);
//        char read;
//        StringBuilder name = new StringBuilder();
//
//        while ((read = (char) fileReader.read()) != ' ') {
//            name.append(read);
//        }
//        StringBuilder age = new StringBuilder();
//
//        while (fileReader.ready()) {
//            age.append((char) fileReader.read());
//        }
//
//        Person person = new Person();
//        person.name = name.toString();
//        person.age = Integer.parseInt(age.toString());
//        System.out.println(person);
//    }
//
//    public static void serializeObject(Car car) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream(PATH);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(car);
//
//        objectOutputStream.flush();
//        objectOutputStream.close();
//        fileOutputStream.flush();
//        fileOutputStream.close();
//    }
//
//    public static Car deserializeObject() throws IOException, ClassNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream(PATH);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        Car car = (Car) objectInputStream.readObject();
//        return car;
//    }
//}
//
//class Person {
//    public String name;
//    public int age;
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}