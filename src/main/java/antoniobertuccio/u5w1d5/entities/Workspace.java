package antoniobertuccio.u5w1d5.entities;

import antoniobertuccio.u5w1d5.enums.WorkspaceType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name= "workspaces")
public class Workspace {

  @Id
  @Setter(AccessLevel.NONE)
  @Column(name = "id")
  private UUID uuid;

  @Column(name = "description")
  private String description;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private WorkspaceType type;

  @Column(name = "capacity")
  private int capacity;

  @ManyToOne
  @JoinColumn(name = "building_id")
  private Building building;

  @Column(name = "is_available")
  private boolean isAvailable;

  @OneToMany(mappedBy = "workspace")
  @ToString.Exclude
  private List<Reservation> reservations;

  public Workspace(String description, WorkspaceType type, int capacity, Building building, boolean isAvailable) {
    this.uuid = UUID.randomUUID();
    this.description = description;
    this.type = type;
    this.capacity = capacity;
    this.building = building;
    this.isAvailable = isAvailable;
  }
}
