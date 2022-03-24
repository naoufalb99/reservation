package iao.KTIRI_BIDARI.reservation.controller;

import iao.KTIRI_BIDARI.reservation.model.Reservation;
import iao.KTIRI_BIDARI.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
    @PostMapping("/reservations")
    public Reservation saveReservation(
            @RequestBody Reservation reservation)
    {
        return reservationService.saveReservation(reservation);
    }
    @PutMapping("/reservations/{id}")
    public Reservation
    updateReservation(@RequestBody Reservation reservation,
                  @PathVariable("id") Long reservationId)
    {
        return reservationService.updateReservation(
                reservation, reservationId);
    }
    @DeleteMapping("/reservations/{id}")
    public String deleteReservationById(@PathVariable("id")
                                            Long reservationId)
    {
        reservationService.deleteReservation(
                reservationId);

        return "Deleted Successfully";
    }
}
