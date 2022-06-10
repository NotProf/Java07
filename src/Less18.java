import java.util.*;

//Написати структуру Банк :
//        Створити клас Account, від нього унаслідувати різні типи акаунтів : DebitAccount(в нього поле Id є стрінговим),
//        CreditAccount	(в нього поле Id є числовим).
//        Створити клас User.
//        Створити параметризований інтерфейс - User service, який буде в якості параметра приймати Account(та наслідників)
//        та User і буде мати наступні методи :
//
//        показати всіх користувачів(посортованих по user name)
//        показати всі рахунки
//        повернути кількість податку для людини, яка розраховується як загальну суму на рахунку * 0,05

public class Less18 {
    public static void main(String[] args) {
        UserServiceImpl<DebitAccount, User> service = new UserServiceImpl<>();
        service.setAccounts(List.of(new DebitAccount("bgh1321", 21320.1)));

        List<User> users = new ArrayList<>();
        users.add(new User("test"));
        users.add(new User("test12"));
        service.setUsers(users);

        service.showAllAccount();
        service.showAllUsers();

        double tax = service.getTax(new DebitAccount("id", 25.6));

        System.out.println(tax);
    }
}

class UserServiceImpl<A extends Account, U extends User> implements UserService<A, U> {

    private List<A> accounts;
    private List<U> users;

    public void setAccounts(List<A> accounts) {
        this.accounts = accounts;
    }

    public void setUsers(List<U> users) {
        this.users = users;
    }

    @Override
    public List<U> showAllUsers() {
        users.sort(new Comparator<U>() {
            @Override
            public int compare(U o1, U o2) {
                return o1.username.compareTo(o2.username);
            }
        });
        for (U user : users) {
            System.out.println(user);
        }
        return this.users;
    }

    @Override
    public List<A> showAllAccount() {
        for (A account : accounts) {
            System.out.println(account);
        }
        return null;
    }

    @Override
    public double getTax(A account) {
        return account.getSum() * 0.5;
    }
}

interface UserService<A extends Account, U extends User> {
     List<U> showAllUsers();
     List<A> showAllAccount();
     double getTax(A account);
}

class User {
    public String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}

class Account<T> {
    protected T id;
    protected double sum;

    public Account(T id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public Account() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}

class DebitAccount extends Account<String> {

    public DebitAccount(String id, double sum) {
        super(id, sum);
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}

class CreditAccount extends Account<Integer> {
    public CreditAccount(Integer id, double sum) {
        super(id, sum);
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
