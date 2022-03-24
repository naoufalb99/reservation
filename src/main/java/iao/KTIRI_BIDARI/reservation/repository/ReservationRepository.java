package iao.KTIRI_BIDARI.reservation.repository;

import iao.KTIRI_BIDARI.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
