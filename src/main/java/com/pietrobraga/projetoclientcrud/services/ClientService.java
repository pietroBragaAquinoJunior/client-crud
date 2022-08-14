package com.pietrobraga.projetoclientcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pietrobraga.projetoclientcrud.dto.ClientDTO;
import com.pietrobraga.projetoclientcrud.entities.Client;
import com.pietrobraga.projetoclientcrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repo;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> clients = repo.findAll(pageRequest);
		return clients.map(x -> new ClientDTO(x));
	}
	
}
