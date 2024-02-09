package antoniobertuccio.u5w1d5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name= "reservations")
public class Reservation {

  @Id
  @Setter(AccessLevel.NONE)
  @Column(name = "id")
  private UUID uuid;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "workspace_id")
  private Workspace workspace;

  @Column(name = "booking_start")
  private LocalDate  bookingStart;

  @Column(name = "booking_end")
  private LocalDate bookingEnd;

  public Reservation(User user, Workspace workspace, LocalDate bookingStart) {
    this.uuid = UUID.randomUUID();
    this.user = user;
    this.workspace = workspace;
    this.bookingStart = bookingStart;
  }
}
