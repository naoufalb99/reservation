package iao.master.reservation.service.impl;

import iao.master.reservation.model.Facture;
import iao.master.reservation.repository.FactureRepository;
import iao.master.reservation.service.FactureService;
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
}
