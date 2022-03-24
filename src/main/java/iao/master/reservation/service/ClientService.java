package iao.master.reservation.service;

import iao.master.reservation.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(Client client);
    List<Client> getAllClients();
    Client updateClient(Client client,Long clientId);
    void deleteClient(Long clientId);
}
