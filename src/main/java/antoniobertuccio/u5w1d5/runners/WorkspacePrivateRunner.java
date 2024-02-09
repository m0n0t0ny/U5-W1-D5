package antoniobertuccio.u5w1d5.runners;

import antoniobertuccio.u5w1d5.dao.BuildingsDAO;
import antoniobertuccio.u5w1d5.dao.WorkspacesDAO;
import antoniobertuccio.u5w1d5.entities.Building;
import antoniobertuccio.u5w1d5.entities.Workspace;
import antoniobertuccio.u5w1d5.enums.WorkspaceType;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Locale;

@Component
public class WorkspacePrivateRunner implements CommandLineRunner {

  @Autowired
  private WorkspacesDAO workspacesDAO;
  @Autowired
  private BuildingsDAO buildingsDAO;

  @Override
  public void run(String... args) throws Exception {
    Faker faker = new Faker(Locale.ITALIAN);

    String description = "Get the space you need to impress clients, hold memorable workshops, or deliver a winning pitch.";
    WorkspaceType type = WorkspaceType.PRIVATE;
    int capacity = faker.number().numberBetween(2, 4);
    List<Building> buildingList = buildingsDAO.findAll();
    Building building = buildingList.get(faker.number().numberBetween(0, buildingList.size()));
    boolean isAvailable = true;


    Workspace newWorkspace = new Workspace(description, type, capacity, building, isAvailable);
    workspacesDAO.save(newWorkspace);
    System.out.println("💾 New private workspace for '" + newWorkspace.getCapacity() + "' people, saved.");
  }
}
