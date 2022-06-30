package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person ee = new Person(20, "Erik","Erikson", "ee@ee.se");

        Person jn = new Person(1, "Jack","Ninway", "jn@jn.se");

        LocalDate deadLine = LocalDate.parse("2022-08-29");

        TodoItem toDo1 = new TodoItem(11,"car wash", deadLine, jn );
        TodoItem toDo2 = new TodoItem(12,"painting", LocalDate.parse("2022-06-29"), ee );

        TodoItemTask todoItemTask1 = new TodoItemTask(1,toDo1, jn );
        TodoItemTask todoItemTask2 = new TodoItemTask(2,toDo2, ee);

        System.out.println(todoItemTask1.getSummary());
        System.out.println(todoItemTask1.getTodoItem().isOverdue());
//        System.out.println(todoItemTask2.getSummary());
//        System.out.println(todoItemTask2.getTodoItem().isOverdue());

    }
}