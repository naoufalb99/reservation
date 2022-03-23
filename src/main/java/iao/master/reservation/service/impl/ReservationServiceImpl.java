package iao.master.reservation.service.impl;

import iao.master.reservation.model.Reservation;
import iao.master.reservation.repository.ReservationRepository;
import iao.master.reservation.service.ReservationService;
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
}
