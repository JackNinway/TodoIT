package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {

    LocalDate deadLine = LocalDate.parse("2022-08-29");
    Person jn = new Person(1, "Jack","Ninway", "jn@jn.se");
    TodoItem toDo = new TodoItem(11,"car wash", deadLine, jn );
    TodoItemTask taskToDo = new TodoItemTask(22, toDo, jn);

    @Test
    public void getSummary() {
//Arrange
        String expectedStr = "";
        String setStr = "id: 22 TodoItem and assigned to : id: 11 title: car wash Deadline: 2022-08-29 Person: id: 1 name: Jack Ninway email: jn@jn.se  is assigned: true";

//Act
        expectedStr = taskToDo.getSummary();
//Assert
        assertEquals(expectedStr, setStr, "No  match.");

    }
}
