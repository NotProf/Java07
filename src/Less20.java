import java.util.*;
//
//Створити потік (унаслідуватись від Thread) DirectThread, реалізувати у ньому метод run(),
// який буде виводити масив(або ліст) елементів, які попередньо ввів користувач з перервою 1.5 секунди.
//
// Створити потік (унаслідуватись від Runnable) SortedRunnable, реалізувати у ньому метод run(),
// який буде виводити масив(або ліст) ПОСОРТОВАНИХ елементів, які попередньо ввів користувач з перервою 1.5 секунди.
//
// Рекомендація : для опрацювання інформації від користувача (масиву) рекомендую зробити інший клас Service,
// у якому буде функціонал для зчитування масиву з консолі. І він буде повертати масив(або ліст)

public class Less20 {
    public static void main(String[] args) throws InterruptedException {
        List<String> infoFromUser = Service.getInfoFromUser();
        DirectThread directThread = new DirectThread(infoFromUser);
        SortedRunnable sortedRunnable = new SortedRunnable(infoFromUser);
        Thread thread = new Thread(sortedRunnable);
        thread.start();
        directThread.start();
    }
}

class Service {
    public static List<String> getInfoFromUser() {
        List<String> results = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of items");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            results.add(scanner.next());
        }

        return results;
    }
}

class SortedRunnable implements Runnable {
    private List<String> items;

    public SortedRunnable(List<String> items) {
        this.items = items;
    }

    @Override
    public void run() {
        items.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String item : items) {
            System.out.println(item);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
class DirectThread extends Thread {
    private List<String> items;

    public DirectThread(List<String> items) {
        this.items = items;
    }

    @Override
    public void run() {
        for (String item : items) {
            System.out.println(item);
            try {
                sleep(1500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}