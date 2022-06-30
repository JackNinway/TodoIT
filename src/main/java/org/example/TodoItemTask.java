package org.example;

/** TodoItemTask maps a task (=TodoItem) to a person
 */
public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
       this.id = id;
       setTodoItem(todoItem);
       setAssignee(assignee);
    }
    public String getSummary(){
        if (assigned) {
            return "id: " + id + " TodoItem and assigned to : " + todoItem.getSummary() +"  is assigned: " + assigned;
        }
       else
            return "task id: " + id + " not assigned.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null)
            throw new IllegalArgumentException("todoItem should not be null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            setAssigned(false);
            throw new IllegalArgumentException("assignee should not be null");

        }
        else
            setAssigned(true);
        this.assignee = assignee;
    }
}
