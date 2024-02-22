package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private final List<TodoItem> todoList;
    public TodoApp(){
        this.todoList = new ArrayList<>();
    }
    public void addTodoItem(TodoItem todoItem){
        this.todoList.add(todoItem);
    }
    public void deleteTodoItem(int index){
        this.todoList.remove(index - 1);
    }
    public void completeTodoITem(int index){
        TodoItem currentTodo = this.todoList.get(index - 1);
        currentTodo.setComplete(true);
    }
    public void editTodoItem(int index, String newTodo){
        TodoItem currentTodo = this.todoList.get(index - 1);
        currentTodo.setTodo(newTodo);
        currentTodo.setComplete(false);
    }
    public void printTodoList(){
        if(this.todoList.isEmpty()){
            System.out.println("You have nothing to do.");
        }
        int i = 1;
        for(TodoItem todoItem : todoList){
            System.out.println(i+". "+todoItem.getTodo()+"; isComplete: "+todoItem.isComplete()+".");
            i++;
        }
    }
}
