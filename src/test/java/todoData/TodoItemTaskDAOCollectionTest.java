package todoData;

import org.example.Person;
import org.example.TodoItem;
import org.example.TodoItemTask;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskDAOCollectionTest {
    Person jn = new Person( "Jack","Ninway", "jn@jn.se");
    Person ee = new Person("Eric", "Ericson", "ee@ee.se");
    LocalDate deadLine = LocalDate.parse("2022-07-29");
    TodoItem toDo1 = new TodoItem("car wash", deadLine, jn );
    TodoItem toDo2 = new TodoItem("paint", LocalDate.now(), ee);

    TodoItemTask todoItemTask1 = new TodoItemTask(toDo1, jn );
    TodoItemTask todoItemTask2 = new TodoItemTask(toDo2, ee );
    TodoItemTaskDAOCollection todoItemTaskDAOCollection = new TodoItemTaskDAOCollection();

    @Test
    void persist() {
//        assertEquals(todoItemTask1, todoItemTaskDAOCollection.persist(todoItemTask1));
        todoItemTaskDAOCollection.persist(todoItemTask1);
        assertEquals(todoItemTask1.hashCode(), todoItemTaskDAOCollection.findById(1).hashCode());
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findByAssignedStatus() {
    }

    @Test
    void findByPersonId() {
    }

    @Test
    void remove() {
    }
}