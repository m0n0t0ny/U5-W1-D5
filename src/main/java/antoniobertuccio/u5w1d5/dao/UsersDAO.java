package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO extends JpaRepository<User, Integer> {
}
