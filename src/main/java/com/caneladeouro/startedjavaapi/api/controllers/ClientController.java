package com.caneladeouro.startedjavaapi.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caneladeouro.startedjavaapi.api.services.ClientService;
import com.caneladeouro.startedjavaapi.domain.entities.Client;

@RestController
public class ClientController {

    @GetMapping("/clients")
    public List<Client> show() {
        var clientService = new ClientService();
        List<Client> clients = clientService.show();

        return clients;
    }
}