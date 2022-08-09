package org.example;

import todoData.AppUserDAOCollection;
import todoData.PersonDAOCollection;
import todoData.TodoItemDAOCollection;
import todoData.TodoItemTaskDAOCollection;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person jn = new Person( "Jack","Ninway", "jn@jn.se");
        Person ee = new Person("Eric", "Ericson", "ee@ee.se");
        LocalDate deadLine = LocalDate.parse("2022-07-29");

        TodoItem toDo1 = new TodoItem("car wash", deadLine, jn );
        TodoItem toDo2 = new TodoItem("paint", LocalDate.now(), ee);

        TodoItemTask todoItemTask1 = new TodoItemTask(toDo1, jn );
        TodoItemTask todoItemTask2 = new TodoItemTask(toDo2, ee );

        AppUser appUser = new AppUser("Jack");
        AppUser appUser1 = new AppUser("Eric");
        jn.setCredentials(appUser);

        AppUserDAOCollection appUserDAOCollection = new AppUserDAOCollection();
        PersonDAOCollection personDAOCollection = new PersonDAOCollection();
        TodoItemDAOCollection todoItemDAOCollection = new TodoItemDAOCollection();
        TodoItemTaskDAOCollection todoItemTaskDAOCollection = new TodoItemTaskDAOCollection();

        System.out.println("Persist1: " + appUserDAOCollection.persist(appUser1));
        System.out.println("Persist2: " + appUserDAOCollection.persist(appUser));
        System.out.println("appUserDAOCollection.findByUsername: " + appUserDAOCollection.findByUsername("Eric"));
        appUserDAOCollection.remove("Eric");
        System.out.println("appUserDAOCollection.findAll(): " + appUserDAOCollection.findAll());

        personDAOCollection.persist(jn);
        personDAOCollection.persist(ee);
        System.out.println("Find all personDAOCollection: " + personDAOCollection.findAll());
        System.out.println("Find by ID  personDAOCollection: " + personDAOCollection.findById(1));

        System.out.println("\n---------------- TodoItemDAOCollection ------------------- \n");
        todoItemDAOCollection.persist(toDo1);
        todoItemDAOCollection.persist(toDo2);
        System.out.println("Find all TodoItemDAOCollection: " + todoItemDAOCollection.findAll());
        System.out.println("findAllByDoneStatus: " + todoItemDAOCollection.findAllByDoneStatus(false));
        System.out.println("FindByDeadlineAfter: " +
                todoItemDAOCollection.findByDeadlineAfter(LocalDate.of(2022,8,9)));
        System.out.println("FindByDeadlineBefore: " +
                todoItemDAOCollection.findByDeadlineBefore(LocalDate.of(2022,8,9)));
        System.out.println("FindByDeadlineAfter: " +
                todoItemDAOCollection.findByDeadlineAfter(LocalDate.of(2022,8,9)));
        todoItemDAOCollection.remove(1);
        System.out.println("Find removed Item: " + todoItemDAOCollection.findById(1));
        System.out.println("Find All: " + todoItemDAOCollection.findAll());

        System.out.println("\n---------------- TodoItemDAO Task Collection ------------------- \n");
        System.out.println(todoItemTaskDAOCollection.persist(todoItemTask1));
        todoItemTaskDAOCollection.persist(todoItemTask2);
        System.out.println("Find all TodoIteTaskDAOCollection: " + todoItemTaskDAOCollection.findAll());
        System.out.println("findAll Assigned Status: " + todoItemTaskDAOCollection.findByAssignedStatus(true));
        todoItemTaskDAOCollection.remove(1);
        System.out.println("Find removed Item: " + todoItemTaskDAOCollection.findById(1));
        System.out.println("Find All: " + todoItemTaskDAOCollection.findAll());

    }
}