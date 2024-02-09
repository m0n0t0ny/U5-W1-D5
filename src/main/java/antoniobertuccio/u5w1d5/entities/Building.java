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
@Table(name= "buildings")
public class Building {

  @Id
  @Setter(AccessLevel.NONE)
  @Column(name = "id")
  private UUID uuid;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  @Column(name = "city")
  private String city;

  @OneToMany(mappedBy = "building")
  @ToString.Exclude
  private List<Workspace> workspaces;

  public Building(String name, String address, String city) {
    this.uuid = UUID.randomUUID();
    this.name = name;
    this.address = address;
    this.city = city;
  }
}
