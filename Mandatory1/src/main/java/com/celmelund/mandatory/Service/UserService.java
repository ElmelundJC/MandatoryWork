package com.celmelund.mandatory.Service;

import com.celmelund.mandatory.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> users = new ArrayList<>();


    public void addUser(String user){
        users.add(new User(user));
    }

// evt tilføjelse af søgefunktion
 /*   public List<User> findUsers(String username) {
        List<User> result = new ArrayList<>();
        for (User user: users){
            if(user.username.startsWith(username))
                result.add(user);
        }
        return result;
    }
  */

}
