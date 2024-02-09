package antoniobertuccio.u5w1d5.service;

import antoniobertuccio.u5w1d5.dao.BuildingsDAO;
import antoniobertuccio.u5w1d5.entities.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

  @Autowired
  private BuildingsDAO buildingsDAO;

  public void saveBuilding(Building newBuilding) {
    buildingsDAO.save(newBuilding);
  }

  public List<Building> findAll() {
    return buildingsDAO.findAll();
  }
}
