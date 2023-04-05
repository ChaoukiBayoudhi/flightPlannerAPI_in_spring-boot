package tn.esb.lmad.flightPlannerAPI.Domains;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "airlines")
@Entity
//in SQL the annotation is translated into
//CREATE TABLE airlines (code INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(70) NOT NULL UNIQUE);

public class Airline {
    //primary key
    @Id
    //auto increment starts from 1 and increments by 1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    @NonNull // JPA annotation to specify that a property is not nullable
    //@Column annotation to specify the column name, length ...
    @Column(unique = true,length = 70,name="airline_name")
    private String name;
    private String contactInformations;
    private String headQuarters;
    @Lob // JPA annotation to specify that a property will be
    // persisted as a large object to a database-supported
    // large object type
    private byte[] logo;
    private int fleetSize;
}
