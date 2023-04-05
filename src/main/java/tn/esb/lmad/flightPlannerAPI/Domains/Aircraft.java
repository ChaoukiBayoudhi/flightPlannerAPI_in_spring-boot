package tn.esb.lmad.flightPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import tn.esb.lmad.flightPlannerAPI.Enumerations.AircraftModel;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
   // JPA annotation to make this object ready for storage in a JPA-based data store
//the database is a relational one
@Entity
public class Aircraft {
    @Id // JPA annotation to specify the primary key of an entity
    private String code;
    @Enumerated(EnumType.STRING)
    private AircraftModel model;
    private int maxPassengerCapacity;
    private  int range;
    private BigDecimal fuelConsumption;

}
