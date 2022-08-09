package org.example;

import sequencers.PersonIdSequencer;

import java.util.Objects;

public class Person {

    private  int id;
    private AppUser credentials;
    private String firstName, lastName, email;

    public Person(String firstName, String lastName, String email) {
        this();
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public Person() {
        this.id = PersonIdSequencer.nextId();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) && email.equals(person.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, email);
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

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
}
