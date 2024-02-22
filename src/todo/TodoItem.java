package todo;

import java.util.UUID;

public class TodoItem {
    private UUID id;
    private String todo;
    private boolean isComplete;

    public TodoItem(UUID id, String todo, boolean isComplete) {
        this.id = id;
        this.todo = todo;
        this.isComplete = isComplete;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
