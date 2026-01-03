import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Restaurant restaurant = new Restaurant();
        Order order = new Order();

        restaurant.addItem(new FoodItem("Burger", 5.99));
        restaurant.addItem(new FoodItem("Pizza", 7.99));
        restaurant.addItem(new DrinkItem("Cola", 1.99));
        restaurant.addItem(new DrinkItem("Coffee", 2.49));

        int choice;

        do {
            System.out.println("\n1. Show menu");
            System.out.println("2. Add item to order");
            System.out.println("3. Show order");
            System.out.println("4. Sort menu by price");
            System.out.println("5. Filter by category");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                restaurant.showMenu();
            }
            else if (choice == 2) {
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                MenuItem item = restaurant.findByName(name);

                if (item != null) {
                    order.addItem(item);
                    System.out.println("Item added");
                } else {
                    System.out.println("Item not found");
                }
            }
            else if (choice == 3) {
                order.showOrder();
            }
            else if (choice == 4) {
                restaurant.sortByPrice();
                System.out.println("Menu sorted");
            }
            else if (choice == 5) {
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                restaurant.filterByCategory(category);
            }

        } while (choice != 0);

        scanner.close();
    }
}