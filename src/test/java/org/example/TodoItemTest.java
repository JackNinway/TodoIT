package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {
    LocalDate deadLine = LocalDate.parse("2022-08-29");
    Person jn = new Person(4, "Jack","Ninway", "jn@jn.se");
    TodoItem toDo = new TodoItem(11,"car wash", deadLine, jn );

    @Test
    public void getSummary() {
//Arrange

        String expectedStr = "";
        String setStr = "id: 11 title: car wash Deadline: 2022-08-29 Person: id: 4 name: Jack Ninway email: jn@jn.se";
//        id: 11 title: car wash Deadline: 2022-08-29 Person: id: 4 name: Jack Ninway email: jn@jn.se

//Act
        expectedStr = toDo.getSummary();
//Assert
        assertEquals(expectedStr, setStr, "No  match.");

    }

    @Test
    public void isOverdue() {
        assertFalse(toDo.isOverdue(),"date passed");

    }
}

