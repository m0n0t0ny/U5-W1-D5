package antoniobertuccio.u5w1d5.runners;

import antoniobertuccio.u5w1d5.dao.BuildingsDAO;
import antoniobertuccio.u5w1d5.dao.WorkspacesDAO;
import antoniobertuccio.u5w1d5.entities.Building;
import antoniobertuccio.u5w1d5.entities.Workspace;
import antoniobertuccio.u5w1d5.enums.WorkspaceType;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Locale;

public class WorkspaceOpenspaceRunner implements CommandLineRunner {

  @Autowired
  private WorkspacesDAO workspacesDAO;
  @Autowired
  private BuildingsDAO buildingsDAO;

  @Override
  public void run(String... args) throws Exception {
    Faker faker = new Faker(Locale.ITALIAN);

    String description = "Get the space you need to impress clients, hold memorable workshops, or deliver a winning pitch.";
    WorkspaceType type = WorkspaceType.PRIVATE;
    int capacity = 1;
    List<Building> buildingList = buildingsDAO.findAll();
    Building building = buildingList.get(faker.number().numberBetween(0, buildingList.size()));
    boolean isAvailable = true;


    Workspace newWorkspace = new Workspace(description, type, capacity, building, isAvailable);
    workspacesDAO.save(newWorkspace);
    System.out.println("💾 New Reservation in openspace workspace with '" + newWorkspace.getCapacity() + "' people capacity, saved.");
  }
}

