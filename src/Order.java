import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double sum = 0;
        for (MenuItem item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void showOrder() {
        items.forEach(System.out::println);
        System.out.println("Total: $" + getTotal());
    }
}