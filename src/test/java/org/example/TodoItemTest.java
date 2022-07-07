package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {
    //Arrange
    Person ee = new Person(20, "Erik","Erikson", "ee@ee.se");
    TodoItem toDo2 = new TodoItem(12,"painting", LocalDate.parse("2022-06-29"), ee);

    @Test
    public void getSummary() {
        String expectedStr = "";
        String setStr = "TodoItem{id=12, title='painting', deadLine=2022-06-29, done=false, creator=id: 20 name: Erik Erikson email: ee@ee.se}";
//        id: 11 title: car wash Deadline: 2022-08-29 Person: id: 4 name: Jack Ninway email: jn@jn.se

//Act
        expectedStr = toDo2.getSummary();
//Assert
        assertEquals(expectedStr, setStr, "No  match.");

    }

    @Test
    public void isOverdue() {
        assertTrue(toDo2.isOverdue(),"date passed");
    }
}

