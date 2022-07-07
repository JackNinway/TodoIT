package org.example;

import java.time.LocalDate;
import  java.time.format.DateTimeFormatter;

/** TodoItem Class task assigned to a person
 */
public class TodoItem {
    private int id;
    private String  title, taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, LocalDate deadLine, Person creator) {
//        this();
        this.id = id;
        setTitle(title);
        setDeadLine(deadLine);
        setCreator(creator);
    }

    public String getSummary(){
        return toString();
//                "id: " +id + " title: " + title +
//                 " Deadline: " + deadLine  + " Person: " + creator.getSummary();

    }

    public boolean isOverdue() {
        LocalDate dateToday = LocalDate.now();
        if (dateToday.isAfter(deadLine) ) {
            setDone(false);
            return true;
        }
        return  false;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator.getSummary() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null)
            throw new IllegalArgumentException("deadLine should not be null");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
