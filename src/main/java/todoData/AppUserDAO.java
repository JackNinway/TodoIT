package todoData;

import org.example.AppUser;

import java.util.Collection;
public interface AppUserDAO {
    AppUser persist(AppUser user);
    AppUser findByUsername(String userName);
    Collection<AppUser> findAll();
    void remove(String userName);

}
