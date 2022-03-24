package iao.KTIRI_BIDARI.reservation.service;

import iao.KTIRI_BIDARI.reservation.model.Facture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FactureService {
    List<Facture> getAllFactures();
    Facture saveFacture(Facture facture);
    Facture updateFacture(Facture facture,Long factureId);
    void deleteFacture(Long factureId);
}
