import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {
    private List<MenuItem> menu = new ArrayList<>();

    public void addItem(MenuItem item) {
        menu.add(item);
    }


    public MenuItem findByName(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }


    public List<MenuItem> filterByCategory(String category) {
        return menu.stream()
                .filter(i -> i.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }


    public void sortByPrice() {
        menu.sort(Comparator.comparingDouble(MenuItem::getPrice));
    }

    public void showMenu() {
        menu.forEach(System.out::println);
    }
}
