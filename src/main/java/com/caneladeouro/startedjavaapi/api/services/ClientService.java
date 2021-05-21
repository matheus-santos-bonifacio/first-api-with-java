package com.caneladeouro.startedjavaapi.api.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.caneladeouro.startedjavaapi.domain.entities.Client;

public class ClientService {
    @PersistenceContext
    private EntityManager manager;

    public List<Client> show() {
        return manager.createQuery("from Client", Client.class).getResultList();
    }
}