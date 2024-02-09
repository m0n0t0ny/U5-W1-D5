package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.Reservation;
import antoniobertuccio.u5w1d5.entities.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.UUID;

@Repository
public interface ReservationsDAO extends JpaRepository<Reservation, UUID> {

  int countByWorkspaceAndBookingStartLessThanEqualAndBookingEndGreaterThanEqual(Workspace workspace, LocalDate bookingStart, LocalDate bookingEnd);

}
