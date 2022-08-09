package todoData;

import org.example.Person;
import org.example.TodoItem;
import org.example.TodoItemTask;
import sequencers.TodoItemTaskIdSequencer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO{

    private HashMap<Integer, TodoItemTask> tdiTaskHM;
    public TodoItemTaskDAOCollection(){
        tdiTaskHM = new HashMap<>();
    }
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        tdiTaskHM.put(todoItemTask.getId(), todoItemTask);
        return tdiTaskHM.get(todoItemTask.getId());
    }

    @Override
    public TodoItemTask findById(int id) {
        return tdiTaskHM.get(id);
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return tdiTaskHM.values();
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        ArrayList<TodoItemTask> found = new ArrayList<>();
        for(TodoItemTask tdiT : tdiTaskHM.values() ) {
            if(tdiT.isAssigned() == status){
                found.add(tdiT);
            }
            return found;
        }
        return  null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        ArrayList<TodoItemTask> found = new ArrayList<>();
        for(TodoItemTask tdiT : tdiTaskHM.values() ) {
            if(tdiT.getAssignee().getId() == personId){
                found.add(tdiT);
            }
            return found;
        }
        return null;
    }

    @Override
    public void remove(int id) {
        tdiTaskHM.remove(id);
    }
}
