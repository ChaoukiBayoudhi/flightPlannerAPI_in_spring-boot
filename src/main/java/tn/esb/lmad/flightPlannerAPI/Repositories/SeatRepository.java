package tn.esb.lmad.flightPlannerAPI.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esb.lmad.flightPlannerAPI.Domains.Seat;

public interface SeatRepository extends JpaRepository<Seat,Long> {
}
