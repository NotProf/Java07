import java.util.*;

public class Less14 {
    public static void main(String[] args) {
//       Purchase purchase_1 = new Purchase("Tomato", 10);
//       Purchase purchase_2 = new Purchase("Onion", 5);
//       Purchase purchase_3 = new Purchase("Potato", 10);
//       Purchase purchase_4 = new Purchase("Beer", 2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of purchases");

        int countOfPurchases = scanner.nextInt();

        Set<Purchase> purchasesLinked = new LinkedHashSet<>();

        for (int i = 0; i < countOfPurchases; i++) {
            System.out.println("Enter name - ");
            String name = scanner.next();
            System.out.println("Enter count - ");
            int count = scanner.nextInt();
            purchasesLinked.add(new Purchase(name, count));
        }

        SortedSet<Purchase> sortedSet = new TreeSet<>(purchasesLinked);

        System.out.println(sortedSet);
        System.out.println(purchasesLinked);

        Set<Purchase> hashSet = new HashSet<>(purchasesLinked);

        System.out.println(hashSet);

        SortedSet<Purchase> sortedSetByCount = new TreeSet<>(new PurchaseCountComparator());

        sortedSetByCount.addAll(purchasesLinked);

        System.out.println(sortedSetByCount);

    }
}

class PurchaseCountComparator implements Comparator<Purchase> {

    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getCount() - o2.getCount();
    }
}

class Purchase implements Comparable<Purchase> {
    private String name;
    private Integer count;

    public Purchase(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(name, purchase.name) &&
                Objects.equals(count, purchase.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.name);
    }
}