//import java.util.*;
//
////Описати структуру коли людині може належати список акаунтів та зробити можливість
////        додати людину до списку;
////        додати акаунт до списку;
////        видалити акаунт для певної людини;
////        видалити людину;
////        показати всю мапу людей та їх акаунти.
////
////        Вважаємо, що людина - унікальний ключ, за значення value беремо List<Account>
////
////Map<Person, List<Account> >
//
//public class Less15 {
//    public static void main(String[] args) {
//        Structure structure = new Structure();
//        Person person = new Person("Ivan Ivanov", "1999");
//
//        structure.addPersonToList(person);
//        structure.addAccountToList(person, new Account(1212.1, 200012));
//        structure.addAccountToList(person, new Account(100.1, 200022));
//
//        structure.addAccountToList(new Person("Den Smith", "2000"),
//                new Account(2000, 1231212));
//
//        structure.showAll();
//    }
//}
//
//class Structure {
//    Map<Person, List<Account>> items = new HashMap<>();
//
//    public void addPersonToList(Person person) {
//        items.put(person, new ArrayList<>());
//    }
//
//    public void addAccountToList(Person person, Account account) {
//        if (items.containsKey(person)) {
//            List<Account> accounts = items.get(person);
//            accounts.add(account);
//            items.put(person, accounts);
//        } else {
//            items.put(person, List.of(account));
//        }
//    }
//
//    public void removeAccount(Person person, Account account) {
//        List<Account> accounts = items.get(person);
//        accounts.remove(account);
//        items.put(person, accounts);
//    }
//
//    public void removePerson(Person person) {
//        items.remove(person);
//    }
//
//    public void showAll() {
//        Set<Map.Entry<Person, List<Account>>> entries = items.entrySet();
//
//        for (Map.Entry<Person, List<Account>> entry : entries) {
//            System.out.println(entry.getKey() + " accounts:");
//            for (Account account: entry.getValue()) {
//                System.out.println("  " + account);
//            }
//        }
//    }
//}
//
//class Account {
//    private double balance;
//    private long number;
//
//    public Account(double balance, long number) {
//        this.balance = balance;
//        this.number = number;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public long getNumber() {
//        return number;
//    }
//
//    public void setNumber(long number) {
//        this.number = number;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Account account = (Account) o;
//        return Double.compare(account.balance, balance) == 0 &&
//                number == account.number;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(balance, number);
//    }
//
//    @Override
//    public String toString() {
//        return "Number: " + number + " balance: " + balance + " $";
//    }
//}
//
//class Person {
//    private String fullname;
//    private String dateOfBirth;
//
//    public Person(String fullname, String dateOfBirth) {
//        this.fullname = fullname;
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//
//    public String getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(fullname, person.fullname) &&
//                Objects.equals(dateOfBirth, person.dateOfBirth);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(fullname, dateOfBirth);
//    }
//
//    @Override
//    public String toString() {
//        return this.fullname + " (" + this.dateOfBirth + ") ";
//    }
//}