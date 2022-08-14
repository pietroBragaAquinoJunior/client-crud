package com.pietrobraga.projetoclientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pietrobraga.projetoclientcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
