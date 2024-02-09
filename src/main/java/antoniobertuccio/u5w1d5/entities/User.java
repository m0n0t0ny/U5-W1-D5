package antoniobertuccio.u5w1d5.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name= "users")
public class User {

  @Id
  @Setter(AccessLevel.NONE)
  @Column(name = "id")
  private UUID uuid;

  @Column(name = "username")
  private String username;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "email")
  private String email;

  @OneToMany(mappedBy = "user")
  @ToString.Exclude
  private List<Reservation> reservations;

  public User(String username, String name, String surname, String email) {
    this.uuid = UUID.randomUUID();
    this.username = username;
    this.name = name;
    this.surname = surname;
    this.email = email;
  }
}
