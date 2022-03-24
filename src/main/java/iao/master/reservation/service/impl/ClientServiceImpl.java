package iao.master.reservation.service.impl;

import iao.master.reservation.model.Client;
import iao.master.reservation.repository.ClientRepository;
import iao.master.reservation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client, Long clientId) {

        Client client1
                = clientRepository.findById(clientId)
                .get();

        if (Objects.nonNull(client.getNom())
                && !"".equalsIgnoreCase(
                client.getNom())) {
            client1.setNom(
                    client.getNom());
        }
        if (Objects.nonNull(client.getPrenom())
                && !"".equalsIgnoreCase(
                client.getPrenom())) {
            client1.setPrenom(
                    client.getPrenom());
        }
        if (Objects.nonNull(
                client.getEmail())
                && !"".equalsIgnoreCase(
                client.getEmail())) {
            client1.setEmail(
                    client.getEmail());
        }

        if (Objects.nonNull(client.getTelephone())
                && !"".equalsIgnoreCase(
                client.getTelephone())) {
            client1.setTelephone(
                    client.getTelephone());
        }
        if (Objects.nonNull(client.getSalaire())
                && client.getSalaire()!=(
                client.getSalaire())) {
            client1.setSalaire(
                    client.getSalaire());
        }

        return clientRepository.save(client1);
    }

    @Override
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
