import java.util.Scanner;

public class ToDoApp {
    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    public static void main(String[] args) {
        String command;
        do {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Edit Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    addTask();
                    break;
                case "2":
                    editTask();
                    break;
                case "3":
                    removeTask();
                    break;
                case "4":
                    toDoList.displayTasks();
                    break;
                case "5":
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        } while (!command.equals("5"));
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        toDoList.addTask(description);
        System.out.println("Task added.");
    }

    private static void editTask() {
        toDoList.displayTasks();
        System.out.print("Enter task number to edit: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.print("Enter new task description: ");
        String newDescription = scanner.nextLine();
        toDoList.editTask(index, newDescription);
        System.out.println("Task updated.");
    }

    private static void removeTask() {
        toDoList.displayTasks();
        System.out.print("Enter task number to remove: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        toDoList.removeTask(index);
        System.out.println("Task removed.");
    }
}

