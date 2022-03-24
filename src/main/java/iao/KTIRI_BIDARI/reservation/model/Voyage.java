package iao.KTIRI_BIDARI.reservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voyage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double tarif;
    private String destination;
    private String logement;
    private String activitee;
    private Integer disponibilitee;
    private Integer nombrePlace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLogement() {
        return logement;
    }

    public void setLogement(String logement) {
        this.logement = logement;
    }

    public String getActivitee() {
        return activitee;
    }

    public void setActivitee(String activitee) {
        this.activitee = activitee;
    }

    public Integer getDisponibilitee() {
        return disponibilitee;
    }

    public void setDisponibilitee(Integer disponibilitee) {
        this.disponibilitee = disponibilitee;
    }

    public Integer getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(Integer nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
}
