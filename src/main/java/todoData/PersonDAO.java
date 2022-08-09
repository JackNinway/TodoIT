package todoData;

import org.example.Person;

import java.util.Collection;

public interface PersonDAO {
    public Person persist(Person person);
    public Person findById(int id);
    public Person findByEmail(String email);
    public Collection<Person> findAll();
    public void remove(int id);
}
