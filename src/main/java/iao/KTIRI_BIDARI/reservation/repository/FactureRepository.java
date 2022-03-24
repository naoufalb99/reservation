package iao.KTIRI_BIDARI.reservation.repository;

import iao.KTIRI_BIDARI.reservation.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
