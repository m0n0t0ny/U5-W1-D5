package antoniobertuccio.u5w1d5.runners;

import antoniobertuccio.u5w1d5.dao.BuildingsDAO;
import antoniobertuccio.u5w1d5.entities.Building;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class BuildingRunner implements CommandLineRunner {

  @Autowired
  private BuildingsDAO buildingsDAO;

  @Override
  public void run(String... args) throws Exception {
    Faker faker = new Faker(Locale.ITALIAN);

    String name = faker.company().name();
    String address = faker.address().streetName();
    String city = faker.address().city();

    Building newBuilding = new Building(name, address, city);
    buildingsDAO.save(newBuilding);
    System.out.println("💾 New building '" + newBuilding.getName() + "' saved.");
  }
}
