package service;

import controller.User;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int creatUser(User user){
      return  this.userDao.saveUser(user);
    }
}
