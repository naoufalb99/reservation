package iao.KTIRI_BIDARI.reservation.service.impl;

import iao.KTIRI_BIDARI.reservation.model.Reservation;
import iao.KTIRI_BIDARI.reservation.repository.ReservationRepository;
import iao.KTIRI_BIDARI.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation, Long reservationId) {
        Reservation reservation1 = reservationRepository.findById(reservationId).get();
        reservation1.setDateReservation(reservation.getDateReservation());
        reservation1.setTypePaiement(reservation.getTypePaiement());
        reservation1.setConfirmation(reservation.getConfirmation());


        return reservationRepository.save(reservation1);
    }

    @Override
    public void deleteReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
