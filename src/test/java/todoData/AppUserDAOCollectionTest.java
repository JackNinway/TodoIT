package todoData;

import org.example.AppUser;
import org.example.Person;
import org.example.TodoItem;
import org.example.TodoItemTask;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppUserDAOCollectionTest {
    AppUser appUser  = new AppUser("Jack");
    AppUserDAOCollection appUserDAOCollection = new AppUserDAOCollection();
    Person jn = new Person( "Jack","Ninway", "jn@jn.se");
    Person ee = new Person("Eric", "Ericson", "ee@ee.se");
    LocalDate deadLine = LocalDate.parse("2022-07-29");
    TodoItem toDo1 = new TodoItem("car wash", deadLine, jn );
    TodoItem toDo2 = new TodoItem("paint", LocalDate.now(), ee);

    TodoItemTask todoItemTask1 = new TodoItemTask(toDo1, jn );
    TodoItemTask todoItemTask2 = new TodoItemTask(toDo2, ee );
    TodoItemTaskDAOCollection todoItemTaskDAOCollection;

    @Test
    void persist() {
        assertEquals(appUser, appUserDAOCollection.persist(appUser));
    }

    @Test
    void findByUsername() {
    }

    @Test
    void findAll() {
    }

    @Test
    void remove() {
    }
}