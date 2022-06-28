package org.example;

public class Person {

    private  int id;
    private String firstName, lastName, email;

    public Person(int id, String firstName, String lastName, String email) {
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Person() {
        this.id = 0;
        this.firstName = "No";
        this.lastName = "Name";
        this.email = "no email";
    }

    public String getSummary(){
        return "id: " + id + " name: " + firstName + " " +lastName + " email: " + email;
    }
    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
