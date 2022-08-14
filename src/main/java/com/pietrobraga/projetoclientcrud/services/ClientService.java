package com.pietrobraga.projetoclientcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pietrobraga.projetoclientcrud.entities.Client;
import com.pietrobraga.projetoclientcrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repo;
	
	@Transactional(readOnly = true)
	public List<Client> findAll(){
		return repo.findAll();
	}
	
}
