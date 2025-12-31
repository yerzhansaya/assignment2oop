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

        while (true) {
            System.out.println("\n1. Show Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Show Order");
            System.out.println("4. Sort Menu by Price");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    restaurant.showMenu();
                    break;

                case 2:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    MenuItem item = restaurant.findByName(name);
                    if (item != null) {
                        order.addItem(item);
                        System.out.println("Added!");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    order.showOrder();
                    break;

                case 4:
                    restaurant.sortByPrice();
                    System.out.println("Menu sorted by price.");
                    break;
            }
        }

        scanner.close();
    }
}