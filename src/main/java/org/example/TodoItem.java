package org.example;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String  title, taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this();
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = new Person();
    }

    public TodoItem() {
        this.id = 0;
        this.title = "undefined";
        this.taskDescription = "undefined";
        this.deadLine =  LocalDate.now();
        this.done = false;
        this.creator = new Person();
    }

    public String getSummary(){
        return "id: " +id + "\ntitle: " + title + "\nDescription: " +taskDescription
                + "\nDeadline: " + deadLine + "\nDone: " +done + "\nPerson: " +creator;

    }
//
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
