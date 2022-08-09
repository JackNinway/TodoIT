package org.example;

import sequencers.TodoItemTaskIdSequencer;

import java.util.Objects;

/** TodoItemTask maps a task (=TodoItem) to a person
 */
public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(TodoItem todoItem, Person assignee) {
       this.id = TodoItemTaskIdSequencer.nextId();
       setTodoItem(todoItem);
       setAssignee(assignee);
    }
    public String getSummary(){
        if (assigned) {
            return toString();
        }
       else
            return "task id: " + id + " not assigned.";
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", is assigned=" + assigned +
                ", \ntodoItem=" + todoItem.toString() +
                ", \nis assigned to: " + assignee.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id && assigned == that.assigned && todoItem.equals(that.todoItem) && Objects.equals(assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, assigned, todoItem, assignee);
    }

    public Person getAssignee() {
        return assignee;
    }
    public void setAssignee(Person assignee) {
        if (assignee == null) {
            setAssigned(false);
            throw new IllegalArgumentException("assignee should not be null");

        }
        else {
            setAssigned(true);
            this.assignee = assignee;
        }
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


}
