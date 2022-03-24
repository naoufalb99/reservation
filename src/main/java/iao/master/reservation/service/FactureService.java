package iao.master.reservation.service;

import iao.master.reservation.model.Facture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FactureService {
    List<Facture> getAllFactures();
    Facture saveFacture(Facture facture);
    Facture updateFacture(Facture facture,Long factureId);
    void deleteFacture(Long factureId);
}
