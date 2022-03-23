package iao.master.reservation.service.impl;

import iao.master.reservation.model.Voyage;
import iao.master.reservation.repository.VoyageRepository;
import iao.master.reservation.service.VoyageService;
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
}
