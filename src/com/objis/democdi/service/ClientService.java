package com.objis.democdi.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.objis.democdi.dao.IClientDao;

public class ClientService {
	
	@Inject
	IClientDao dao;
	
	public String creerClient() {
		return "Service : " + dao.insertClient();
	}

	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Service");
	}
}
