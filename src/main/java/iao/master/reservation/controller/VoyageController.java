package iao.master.reservation.controller;

import iao.master.reservation.model.Client;
import iao.master.reservation.model.Voyage;
import iao.master.reservation.service.ClientService;
import iao.master.reservation.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/voyages")
public class VoyageController {
    @Autowired
    private VoyageService voyageService;

    @GetMapping
    public List<Voyage> getAllVoyages() {
        return voyageService.getAllVoyages();
    }
}
