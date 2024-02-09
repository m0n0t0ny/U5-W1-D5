package antoniobertuccio.u5w1d5.service;

import antoniobertuccio.u5w1d5.dao.ReservationsDAO;
import antoniobertuccio.u5w1d5.dao.UsersDAO;
import antoniobertuccio.u5w1d5.dao.WorkspacesDAO;
import antoniobertuccio.u5w1d5.entities.Workspace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationService {

  @Autowired
  private ReservationsDAO reservationsDAO;

  @Autowired
  private UsersDAO usersDAO;

  @Autowired
  private WorkspacesDAO workspacesDAO;

  @Autowired
  private WorkspacesService workspaceService;

  public boolean isWorkspaceAvailableForDate(Workspace workspace, LocalDate date) {
    return reservationsDAO.countByWorkspaceAndBookingStartLessThanEqualAndBookingEndGreaterThanEqual(workspace, date, date) == 0;
  }
}
