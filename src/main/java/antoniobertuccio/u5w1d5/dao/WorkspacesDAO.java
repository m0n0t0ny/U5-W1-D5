package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.Building;
import antoniobertuccio.u5w1d5.entities.Workspace;
import antoniobertuccio.u5w1d5.enums.WorkspaceType;

import java.util.List;

public interface WorkspacesDAO {
  List<Workspace> findAll();

  Workspace findById(int id);

  List<Workspace> findByType(WorkspaceType type);

  List<Workspace> findByBuilding(Building building);

  void save(Workspace workspace);

  void delete(Workspace workspace);
}
