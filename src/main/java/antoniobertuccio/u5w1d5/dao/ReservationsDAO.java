package antoniobertuccio.u5w1d5.dao;

import antoniobertuccio.u5w1d5.entities.Reservation;
import antoniobertuccio.u5w1d5.entities.User;
import antoniobertuccio.u5w1d5.entities.Workspace;

import java.time.LocalDate;
import java.util.List;

public interface ReservationsDAO {
  List<Reservation> findAll();

  Reservation findById(int id);

  List<Reservation> findByUser(User user);

  List<Reservation> findByWorkspace(Workspace workspace);

  List<Reservation> findByBookingDate(LocalDate bookingDate);

  void save(Reservation reservation);

  void delete(Reservation reservation);
}
