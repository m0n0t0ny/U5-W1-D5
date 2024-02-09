package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UsersDAO extends JpaRepository<User, UUID> {

  @Override
  List<User> findAll();
}
