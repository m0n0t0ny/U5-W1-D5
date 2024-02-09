package antoniobertuccio.u5w1d5.runners;

import antoniobertuccio.u5w1d5.dao.ReservationsDAO;
import antoniobertuccio.u5w1d5.dao.UsersDAO;
import antoniobertuccio.u5w1d5.dao.WorkspacesDAO;
import antoniobertuccio.u5w1d5.entities.Reservation;
import antoniobertuccio.u5w1d5.entities.User;
import antoniobertuccio.u5w1d5.entities.Workspace;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Component
public class ReservationRunner implements CommandLineRunner {

  @Autowired
  private ReservationsDAO reservationsDAO;

  @Autowired
  private UsersDAO usersDAO;

  @Autowired
  private WorkspacesDAO workspacesDAO;

  @Override
  public void run(String... args) throws Exception {
    Faker faker = new Faker(Locale.ITALIAN);

    List<User> userList = usersDAO.findAll();
    User user = userList.get(faker.number().numberBetween(0, userList.size()));
    List<Workspace> workspaceList = workspacesDAO.findAll();
    Workspace workspace = workspaceList.get(faker.number().numberBetween(0, workspaceList.size()));
    LocalDate bookingStart = LocalDate.now().plusDays(1 + new Random().nextInt(364));

    Reservation newReservation = new Reservation(user, workspace, bookingStart);
    reservationsDAO.save(newReservation);
    System.out.println("💾 New reservation '" + newReservation.getUuid() + "' saved.");
  }
}
