package br.edu.infnet.sowsales.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.sowsales.model.domain.User;

import java.util.HashMap;
import java.util.Collection;

@Repository
public class UserRepository {
    private static Integer id = 1;
    private static Map<Integer,User> mappedUsers = new HashMap<Integer, User>();
    public boolean add(User user){
        try{
            user.setId(id++);
            mappedUsers.put(user.getId(),user);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public User removeUser(Integer key){
      return mappedUsers.remove(key);  
    }
    public Collection<User> returnList(){
        return  mappedUsers.values();
    }
}
