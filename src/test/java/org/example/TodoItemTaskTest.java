package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    LocalDate deadLine = LocalDate.parse("2022-06-29");
    Person jn = new Person("Jack","Ninway", "jn@jn.se");
    TodoItem toDo = new TodoItem("car wash", deadLine, jn );
    TodoItemTask taskToDo = new TodoItemTask( toDo, jn);

    @Test
    public void getSummary() {
//Arrange
        String expectedStr = "";
        String setStr = "TodoItemTask{id=22, is assigned=true, \n" +
                "todoItem=TodoItem{id=11, title='car wash', deadLine=2022-06-29, done=false, creator=id: 1 name: Jack Ninway email: jn@jn.se}, \n" +
                "is assigned to: id: 1 name: Jack Ninway email: jn@jn.se}";
//Act
        expectedStr = taskToDo.getSummary();
//Assert
        assertEquals(expectedStr, setStr, "No  match.");
    }
}
