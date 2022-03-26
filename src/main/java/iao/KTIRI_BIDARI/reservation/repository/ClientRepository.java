package iao.KTIRI_BIDARI.reservation.repository;

import iao.KTIRI_BIDARI.reservation.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findFirstByEmail(String email);
}
