package iao.master.reservation.controller;


import iao.master.reservation.model.Voyage;

import iao.master.reservation.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class VoyageController {
    @Autowired
    private VoyageService voyageService;

    @GetMapping("/voyages")
    public List<Voyage> getAllVoyages() {
        return voyageService.getAllVoyages();
    }
    @PostMapping("/voyages")
    public Voyage saveVoyage(
            @RequestBody Voyage voyage)
    {
        return voyageService.saveVoyage(voyage);
    }
    @PutMapping("/voyages/{id}")
    public Voyage
    updateVoyage(@RequestBody Voyage voyage,
                      @PathVariable("id") Long voyageId)
    {
        return voyageService.updateVoyage(
                voyage, voyageId);
    }
    @DeleteMapping("/voyages/{id}")
    public String deleteVoyageById(@PathVariable("id")
                                                Long voyageId)
    {
        voyageService.deleteVoyage(
                voyageId);

        return "Deleted Successfully";
    }
}
