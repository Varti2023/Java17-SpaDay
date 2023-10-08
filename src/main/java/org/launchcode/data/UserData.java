package org.launchcode.data;

import org.launchcode.controllers.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserData {

    public static final Map<Integer, User> users =  new HashMap<>() ;

    public static void add(User user){
        users.put(user.getId(),user);
    }

    public static User getById(int id){
        return users.get(id);
    }

    public static Collection<User> getAll(){
        return users.values();
    }
}
