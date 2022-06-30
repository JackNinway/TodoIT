package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void correctStringReturned() {
        //Arrange
        Person jn = new Person(4, "Jack", "Ninway", "jn@jn.se");
        String expectedStr = "";
        String setPerson = "id: 4 name: Jack Ninway email: jn@jn.se";
        //Act
        expectedStr = jn.getSummary();

        assertEquals(expectedStr, setPerson, "No  match.");
    }
}
