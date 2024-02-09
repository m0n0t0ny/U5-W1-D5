package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.Building;

import java.util.List;

public interface BuildingsDAO {

  List<Building> findAll();

  Building findById(int id);

  void save(Building building);

  void delete(Building building);
}
