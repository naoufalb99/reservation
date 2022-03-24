package iao.KTIRI_BIDARI.reservation.service;

import iao.KTIRI_BIDARI.reservation.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation,Long reservationId);
    void deleteReservation(Long reservationId);
}
