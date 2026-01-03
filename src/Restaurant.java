import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> menu = new ArrayList<>();

    // organizing data pool
    public void addItem(MenuItem item) {
        menu.add(item);
    }

    // searching
    public MenuItem findByName(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    // filtering
    public void filterByCategory(String category) {
        for (MenuItem item : menu) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println(item);
            }
        }
    }

    // sorting
    public void sortByPrice() {
        for (int i = 0; i < menu.size(); i++) {
            for (int j = i + 1; j < menu.size(); j++) {
                if (menu.get(i).getPrice() > menu.get(j).getPrice()) {
                    MenuItem temp = menu.get(i);
                    menu.set(i, menu.get(j));
                    menu.set(j, temp);
                }
            }
        }
    }

    public void showMenu() {
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }
}