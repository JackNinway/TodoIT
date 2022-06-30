package org.example;

import java.time.LocalDate;
import  java.time.format.DateTimeFormatter;
public class TodoItem {
    private int id;
    private String  title, taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, LocalDate deadLine, Person creator) {
//        this();
        this.id = id;
        this.title = title;
//        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = false;
        this.creator = creator;
    }
/*
    public TodoItem() {
        this.id = 0;
        this.title = "undefined";   //change tires
//        this.taskDescription = "undefined";
        this.deadLine =  LocalDate.now();   // when task has to be finished
        this.done = false;  //task finished ?
        this.creator = new Person();
    }*/

    public String getSummary(){
        return "id: " +id + " title: " + title +
                 " Deadline: " + deadLine  + " Person: " + creator.getSummary();

    }

    public boolean isOverdue() {
        LocalDate dateToday = LocalDate.now();
        if (dateToday.isAfter(deadLine) ) {
            done = false;
            return true;
        }
        return  false;
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
