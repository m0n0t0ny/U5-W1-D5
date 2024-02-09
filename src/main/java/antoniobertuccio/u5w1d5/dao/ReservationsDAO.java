package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReservationsDAO extends JpaRepository<Reservation, UUID> {
}
