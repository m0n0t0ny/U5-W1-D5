package antoniobertuccio.u5w1d5.service;

import antoniobertuccio.u5w1d5.dao.WorkspacesDAO;
import antoniobertuccio.u5w1d5.entities.Workspace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkspacesService {

  @Autowired
  private WorkspacesDAO workspacesDAO;

  public void saveWorkspace(Workspace newWorkspace) {
    workspacesDAO.save(newWorkspace);
  }

  public List<Workspace> findAll() {
    return workspacesDAO.findAll();
  }

  public List<Workspace> findAvailableWorkspacesByTypeAndCity(String type, String city) {
    return workspacesDAO.findByTypeAndBuilding_CityAndIsAvailableIsTrue(type, city);
  }
}
