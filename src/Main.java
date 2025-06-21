import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List App ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Clear All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;
                case 2:
                    System.out.println("📋 Your Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int index = sc.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("❌ Task deleted!");
                    } else {
                        System.out.println("⚠️ Invalid task number!");
                    }
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    System.exit(0);
                    break;
                case 5:
                    tasks.clear();
                    System.out.println("🧹 All tasks cleared!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice. Try again!");
            }
        }
    }
}
