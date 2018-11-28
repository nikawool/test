package com.test.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.model.User ;
import com.test.dao.UserDAO ;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public int addUser(User user)
    {
        return userDAO.insert(user);
    }
    public User selectById(Integer id){
        return userDAO.selectById(id);
    }
    public List<User> selectAll(){
        return userDAO.selectAll();
    }
    public int deleteById(Integer id){
        return userDAO.deleteById(id);
    }
    public int updateById(User user){
        return userDAO.updateById(user);
    }
}
