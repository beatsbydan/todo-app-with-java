import todo.TodoApp;
import todo.TodoItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TodoApp todoApp = new TodoApp();
        boolean appIsRunning = true;

        System.out.println("Welcome to your Todo App!");

        while(appIsRunning) {
            System.out.println("What do you want to do today? Select an option below:");
            System.out.println("1. View todo items.");
            System.out.println("2. Add an item.");
            System.out.println("3. Edit a Todo item.");
            System.out.println("4. Complete a Todo item.");
            System.out.println("5. Delete a Todo item.");
            System.out.println("6. Exit application.");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    todoApp.printTodoList();
                    break;
                case 2:
                    System.out.println("Enter item: ");

                    String todo = sc.nextLine();
                    UUID todoId = UUID.randomUUID();

                    TodoItem todoItem = new TodoItem(
                            todoId,
                            todo,
                            false
                    );

                    todoApp.addTodoItem(todoItem);
                    break;
                case 3:
                    System.out.println("Select item to edit:");
                    todoApp.printTodoList();
                    int toEdit = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new Todo:");
                    String newTodo = sc.nextLine();
                    todoApp.editTodoItem(toEdit, newTodo);
                    break;
                case 4:
                    System.out.println("Select item to complete:");
                    todoApp.printTodoList();
                    int toComplete = sc.nextInt();
                    todoApp.completeTodoITem(toComplete);
                    break;
                case 5:
                    System.out.println("Select item to delete:");
                    todoApp.printTodoList();
                    int toDelete = sc.nextInt();
                    todoApp.deleteTodoItem(toDelete);
                    break;
                case 6:
                    appIsRunning = false;
                    System.out.println("See you soon...");
                    break;
                default:
                    System.out.println("Invalid response. Try again.");
            }
        }
    }
}