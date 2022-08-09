package todoData;

import org.example.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class TodoItemDAOCollection implements TodoItemDAO{
    ArrayList<TodoItem> todoItemArrayList;

    public TodoItemDAOCollection() {
        todoItemArrayList = new ArrayList<>();
    }
    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemArrayList.add(todoItem);
        if(todoItemArrayList.contains(todoItem))
            return todoItem;
        else
            return  null;
    }

    @Override
    public TodoItem findById(int id) {
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.getId() == id){
                return tdI;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return todoItemArrayList;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        ArrayList<TodoItem> found = new ArrayList<>();
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.isDone() == done){
                found.add(tdI);
            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        ArrayList<TodoItem> found = new ArrayList<>();
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.getTitle().toLowerCase().contains(title.toLowerCase())){
                found.add(tdI);            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        ArrayList<TodoItem> found = new ArrayList<>();
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.getCreator().getId() == personId){
                found.add(tdI);
            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        ArrayList<TodoItem> found = new ArrayList<>();
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.getDeadLine().isBefore(date))   {
                found.add(tdI);
            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        ArrayList<TodoItem> found = new ArrayList<>();
        for(TodoItem tdI : todoItemArrayList){
            if(tdI.getDeadLine().isAfter(date))   {
                found.add(tdI);
            }
        }
        return found;
    }

    @Override
    public void remove(int id) {
        ListIterator<TodoItem> todoItemListIterator = todoItemArrayList.listIterator();

        while (todoItemListIterator.hasNext()){
            TodoItem tdI = todoItemListIterator.next();
            if (tdI.getId() == id){
                todoItemListIterator.remove();
//                continue;
            }
        }
    }
}
