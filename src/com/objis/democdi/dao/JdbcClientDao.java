package com.objis.democdi.dao;

import javax.annotation.PostConstruct;

public class JdbcClientDao implements IClientDao {

	@Override
	public String insertClient() {
		return "Creation client en base de données avec Jdbc pur ok !";
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création ClientDao");
	}
}
