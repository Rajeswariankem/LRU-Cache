import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println(" *** LRU Cache Demo  ***");
        System.out.println("      ----------- ");
        System.out.print("Enter cache capacity: ");

        // Read cache capacity
        int capacity = sc.nextInt();

        LRUCache cache=new LRUCache(capacity);

        while (true) {
            // Display menu
            System.out.println("\n*** MENU ***");
            System.out.println("1.PUT");
            System.out.println("2.GET");
            System.out.println("3.DISPLAY CACHE");
            System.out.println("4.EXIT");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                     // Insert or update key-value pair
                    System.out.println("Enter Key :");
                    int key=sc.nextInt();
                    System.out.println("Enter Value :");
                    int value=sc.nextInt();
                    cache.put(key, value);
                    break;
                case 2:
                    // Retrieve value for a key
                    System.out.println("Enter key :");
                    key=sc.nextInt();
                    cache.get(key);
                    break;
                case 3:
                    // Display current cache state
                    cache.print();
                    break;
                case 4:
                    // Exit program
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice..! Try again!");
            }
        }
    }
}
