package iao.KTIRI_BIDARI.reservation.controller;

import iao.KTIRI_BIDARI.reservation.model.Facture;
import iao.KTIRI_BIDARI.reservation.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class FactureController {
    @Autowired
    private FactureService factureService;

    @GetMapping("/factures")
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }
    @PostMapping("/factures")
    public Facture saveFacture(
            @RequestBody Facture facture)
    {
        return factureService.saveFacture(facture);
    }
    @PutMapping("/factures/{id}")
    public Facture
    updateFacture(@RequestBody Facture facture,
                 @PathVariable("id") Long factureId)
    {
        return factureService.updateFacture(
                facture, factureId);
    }
    @DeleteMapping("/factures/{id}")
    public String deleteFactureById(@PathVariable("id")
                                           Long factureId)
    {
        factureService.deleteFacture(
                factureId);

        return "Deleted Successfully";
    }
}
