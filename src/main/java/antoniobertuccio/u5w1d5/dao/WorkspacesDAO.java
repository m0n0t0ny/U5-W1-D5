package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.User;
import antoniobertuccio.u5w1d5.entities.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WorkspacesDAO extends JpaRepository<Workspace, UUID> {

  @Override
  List<Workspace> findAll();
}
