package antoniobertuccio.u5w1d5.service;

import antoniobertuccio.u5w1d5.dao.UsersDAO;
import antoniobertuccio.u5w1d5.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
  @Autowired
  private UsersDAO usersDAO;

  public void saveUser(User newUser) {
    usersDAO.save(newUser);
  }
}
