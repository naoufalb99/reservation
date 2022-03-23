package iao.master.reservation.service.impl;

import iao.master.reservation.model.Client;
import iao.master.reservation.repository.ClientRepository;
import iao.master.reservation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
