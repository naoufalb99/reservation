package iao.master.reservation.service;

import iao.master.reservation.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    List<Client> getAllClients();
}
