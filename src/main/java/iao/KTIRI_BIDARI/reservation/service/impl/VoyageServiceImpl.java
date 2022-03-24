package iao.KTIRI_BIDARI.reservation.service.impl;

import iao.KTIRI_BIDARI.reservation.model.Voyage;
import iao.KTIRI_BIDARI.reservation.repository.VoyageRepository;
import iao.KTIRI_BIDARI.reservation.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoyageServiceImpl implements VoyageService {
    @Autowired
    private VoyageRepository voyageRepository;

    @Override
    public List<Voyage> getAllVoyages() {
        return voyageRepository.findAll();
    }

    @Override
    public Voyage saveVoyage(Voyage voyage) {
        return voyageRepository.save(voyage);
    }

    @Override
    public Voyage updateVoyage(Voyage voyage, Long voyageId) {
        Voyage voyage1 = voyageRepository.findById(voyageId).get();
        voyage1.setActivitee(voyage.getActivitee());
        voyage1.setDestination(voyage.getDestination());
        voyage1.setDisponibilitee(voyage.getDisponibilitee());
        voyage1.setLogement(voyage.getLogement());
        voyage1.setNombrePlace(voyage.getNombrePlace());
        voyage1.setTarif(voyage.getTarif());


        return voyageRepository.save(voyage1);

    }

    @Override
    public void deleteVoyage(Long voyageId) {
        voyageRepository.deleteById(voyageId);
    }
}
