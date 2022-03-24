package iao.KTIRI_BIDARI.reservation.service.impl;

import iao.KTIRI_BIDARI.reservation.model.Facture;
import iao.KTIRI_BIDARI.reservation.repository.FactureRepository;
import iao.KTIRI_BIDARI.reservation.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {
    @Autowired
    private FactureRepository factureRepository;

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture saveFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Facture facture, Long factureId) {
        Facture facture1 = factureRepository.findById(factureId).get();
        facture1.setAcompte(facture.getAcompte());
        facture1.setMontant(facture.getMontant());
        facture1.setSolde(facture.getSolde());


        return factureRepository.save(facture1);

    }

    @Override
    public void deleteFacture(Long factureId) {
        factureRepository.deleteById(factureId);
    }
}
