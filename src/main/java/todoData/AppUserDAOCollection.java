package todoData;

import org.example.AppUser;

import java.util.Collection;
import java.util.HashMap;

public class AppUserDAOCollection implements AppUserDAO{

    private  HashMap<String, AppUser> appUserHashMap;

    public AppUserDAOCollection() {
        appUserHashMap = new HashMap<String, AppUser>();
    }
    @Override
    public AppUser persist(AppUser user) {
        appUserHashMap.put(user.getUserName(), user);
        return appUserHashMap.get(user.getUserName());
    }

    @Override
    public AppUser findByUsername(String userName) {
        return appUserHashMap.get(userName);
    }

    @Override
    public Collection<AppUser> findAll() {
        return appUserHashMap.values();
    }

    @Override
    public void remove(String userName) {
        appUserHashMap.remove(userName);
    }

    @Override
    public String toString() {
        return "AppUserDAOCollection{" +
                "appUserHashMap=" + appUserHashMap +
                '}';
    }
}
