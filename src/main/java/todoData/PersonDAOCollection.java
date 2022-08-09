package todoData;

import org.example.Person;

import java.util.Collection;
import java.util.HashMap;

public class PersonDAOCollection implements PersonDAO{
    private HashMap<Integer, Person> personHashMap;

    public PersonDAOCollection() {
        personHashMap = new HashMap<>();
    }
    @Override
    public Person persist(Person person) {
        personHashMap.put(person.getId(), person);
        return personHashMap.get(person.getId());
    }

    @Override
    public Person findById(int id) {
        return personHashMap.get(id);
    }

    @Override
    public Person findByEmail(String email) {
        for(Person p : personHashMap.values()){
            if(p.getEmail().equals(email)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return personHashMap.values();
    }

    @Override
    public void remove(int id) {
        personHashMap.remove(id);
    }
}
