package iao.master.reservation.controller;


import iao.master.reservation.model.Client;
import iao.master.reservation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }


    @PostMapping("/clients")
    public Client saveClient(
            @RequestBody Client client)
    {
        return clientService.saveClient(client);
    }
    @PutMapping("/clients/{id}")
    public Client
    updateClient(@RequestBody Client client,
                     @PathVariable("id") Long clientId)
    {
        return clientService.updateClient(
                client, clientId);
    }
    @DeleteMapping("/clients/{id}")
    public String deleteClientById(@PathVariable("id")
                                               Long clientId)
    {
        clientService.deleteClient(
                clientId);

        return "Deleted Successfully";
    }
}
