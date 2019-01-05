package br.com.codenation;

import br.com.codenation.desafio.services.DBService;

public class Inicio {

	public static void main(String[] args) {
		DBService dbs = new DBService();
		dbs.instanciaClasses();
		
	}

}
