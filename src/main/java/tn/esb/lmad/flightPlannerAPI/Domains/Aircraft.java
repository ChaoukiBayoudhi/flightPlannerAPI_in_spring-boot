package tn.esb.lmad.flightPlannerAPI.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

   // JPA annotation to make this object ready for storage in a JPA-based data store
//the database is a relational one
public class Aircraft {
    @Id // JPA annotation to specify the primary key of an entity
    private String code;
    private String model;
}
