package antoniobertuccio.u5w1d5.runners;

import antoniobertuccio.u5w1d5.dao.UsersDAO;
import antoniobertuccio.u5w1d5.entities.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class UserRunner implements CommandLineRunner {

  @Autowired
  private UsersDAO usersDAO;

  @Override
  public void run(String... args) throws Exception {
    Faker faker = new Faker(Locale.ITALIAN);

    String username = faker.name().username();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String email = faker.internet().emailAddress();

    User newUser = new User(username, name, surname, email);
    usersDAO.save(newUser);
    System.out.println("💾 New user '" + newUser.getUsername() + "' saved.");
  }
}
