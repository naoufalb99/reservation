package iao.master.reservation.service;

import iao.master.reservation.model.Voyage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VoyageService {
    List<Voyage> getAllVoyages();
}
