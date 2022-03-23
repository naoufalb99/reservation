package iao.master.reservation.controller;

import iao.master.reservation.dto.ClientDto;
import iao.master.reservation.model.Client;
import iao.master.reservation.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    public String saveClient(@RequestBody ClientDto clientDto) {
//        clientService.saveClient(clientDto);
        return "OK";
    }
}
