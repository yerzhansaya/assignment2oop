import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showOrder() {
        double total = 0;

        for (MenuItem item : items) {
            System.out.println(item);
            total += item.getPrice();
        }

        System.out.println("Total: $" + total);
    }
}