package br.com.codenation.desafio.services;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.codenation.DesafioMeuTimeApplication;
import br.com.codenation.desafio.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;

public class DBService {

	public void instanciaClasses() {

		DesafioMeuTimeApplication desafio = new DesafioMeuTimeApplication();

		// Incluindo Times

		System.out.println("");
		System.out.println("Incluindo Times");

		LocalDate dataFundacao = LocalDate.of(1903, 9, 15);

		try {
			desafio.incluirTime((long) 10, "Gremio", dataFundacao, "Azul", "Branco");
		} catch (IdentificadorUtilizadoException e) {
			System.out.println(e.getMessage());
		}
		try {
			desafio.incluirTime((long) 11, "Iternacional", dataFundacao, "Vermelha", "Branco");
		} catch (IdentificadorUtilizadoException e) {
			System.out.println(e.getMessage());
		}
		try {
			desafio.incluirTime((long) 10, "Caxias", dataFundacao, "Azul", "Branco");
		} catch (IdentificadorUtilizadoException e) {
			System.out.println(e.getMessage());
		}
		try {
			desafio.incluirTime((long) 13, "São jose", dataFundacao, "Azul", "Branco");
		} catch (IdentificadorUtilizadoException e) {
			System.out.println(e.getMessage());
		}
		try {
			desafio.incluirTime((long) 9, "Corintians", dataFundacao, "Preto", "Branco");
		} catch (IdentificadorUtilizadoException e) {
			System.out.println(e.getMessage());
		}

		// Incluindo Jogador

		System.out.println("");
		System.out.println("Incluindo jogadores");

		try {

			LocalDate dataNascimento1 = LocalDate.of(1980, 9, 10);
			BigDecimal big1 = new BigDecimal("9000.00");
			desafio.incluirJogador((long) 101, (long) 13, "Joao j", dataNascimento1, (Integer) 5, big1);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento1 = LocalDate.of(1981, 9, 11);
			BigDecimal big1 = new BigDecimal("9000.00");
			desafio.incluirJogador((long) 102, (long) 13, "Alexandre", dataNascimento1, (Integer) 5, big1);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento1 = LocalDate.of(1982, 9, 10);
			BigDecimal big1 = new BigDecimal("9000.00");
			desafio.incluirJogador((long) 99, (long) 13, "Joao pedro", dataNascimento1, (Integer) 5, big1);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento1 = LocalDate.of(1982, 9, 10);
			BigDecimal big1 = new BigDecimal("9000.00");
			desafio.incluirJogador((long) 1, (long) 10, "Roger", dataNascimento1, (Integer) 5, big1);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento2 = LocalDate.of(1982, 9, 10);
			BigDecimal big2 = new BigDecimal("14350.00");
			desafio.incluirJogador((long) 2, (long) 10, "Mario", dataNascimento2, (Integer) 8, big2);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento3 = LocalDate.of(1985, 2, 10);
			BigDecimal big3 = new BigDecimal("9350.00");
			desafio.incluirJogador((long) 44, (long) 10, "Carlos", dataNascimento3, (Integer) 8, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}
		try {

			LocalDate dataNascimento3 = LocalDate.of(1986, 2, 10);
			BigDecimal big3 = new BigDecimal("9250.00");
			desafio.incluirJogador((long) 4, (long) 11, "Carlos da Silva", dataNascimento3, (Integer) 7, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}
		try {

			LocalDate dataNascimento3 = LocalDate.of(1987, 2, 10);
			BigDecimal big3 = new BigDecimal("1150.00");
			desafio.incluirJogador((long) 15, (long) 10, "João Carlos", dataNascimento3, (Integer) 5, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}
		try {

			LocalDate dataNascimento3 = LocalDate.of(1988, 2, 10);
			BigDecimal big3 = new BigDecimal("14350.00");
			desafio.incluirJogador((long) 7, (long) 10, "Flavio Marcone", dataNascimento3, (Integer) 6, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento3 = LocalDate.of(1989, 2, 10);
			BigDecimal big3 = new BigDecimal("5350.00");
			desafio.incluirJogador((long) 21, (long) 10, "Pedro II", dataNascimento3, (Integer) 6, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento3 = LocalDate.of(1990, 2, 10);
			BigDecimal big3 = new BigDecimal("6350.00");
			desafio.incluirJogador((long) 21, (long) 10, "Paulo", dataNascimento3, (Integer) 6, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			LocalDate dataNascimento3 = LocalDate.of(1991, 2, 10);
			BigDecimal big3 = new BigDecimal("7350.00");
			desafio.incluirJogador((long) 20, (long) 10, "hwels", dataNascimento3, (Integer) 1, big3);

		} catch (IdentificadorUtilizadoException e) {

			System.out.println(e.getMessage());

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// definir capitao

		try {
			desafio.definirCapitao((long) 2);
		} catch (JogadorNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		// buscar capitao

		try {
			desafio.buscarCapitaoDoTime((long) 10);
		} catch (CapitaoNaoInformadoException e) {
			System.out.println(e.getMessage());
		} catch (TimeNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

		// Busca nome jogador

		System.out.println("");
		System.out.println("Buscando nome de jogador");

		try {

			System.out.println(desafio.buscarNomeJogador((long) 1));

		} catch (JogadorNaoEncontradoException e) {

			System.out.println(e.getMessage());

		}
		try {

			System.out.println(desafio.buscarNomeJogador((long) 200));

		} catch (JogadorNaoEncontradoException e) {

			System.out.println(e.getMessage());

		}
		try {

			System.out.println(desafio.buscarNomeJogador((long) 3));

		} catch (JogadorNaoEncontradoException e) {

			System.out.println(e.getMessage());

		}

		// Busca nome do time
		System.out.println("");
		System.out.println("Buscando nome do time");

		try {

			System.out.println(desafio.buscarNomeTime((long) 10));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			System.out.println(desafio.buscarNomeTime((long) 100));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {

			System.out.println(desafio.buscarNomeTime((long) 11));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Busca jogadores do time
		System.out.println("");
		System.out.println("Buscando jogadores do time");

		try {
			System.out.println("Busca jogadores " + desafio.buscarJogadoresDoTime((long) 10));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Busca jogadores " + desafio.buscarJogadoresDoTime((long) 100));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Busca jogadores " + desafio.buscarJogadoresDoTime((long) 13));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Busca jogadores " + desafio.buscarJogadoresDoTime((long) 11));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Busca melhor jogador do time
		System.out.println("");
		System.out.println("Buscando melhor jogador do time");

		try {
			System.out.println("Busca melhor jogado " + desafio.buscarMelhorJogadorDoTime((long) 10));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Busca melhor jogado " + desafio.buscarMelhorJogadorDoTime((long) 100));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Busca jogador mais velho
		System.out.println("");
		System.out.println("Buscando jogador mais velho");

		try {
			System.out.println(desafio.buscarJogadorMaisVelho((long) 10));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println(desafio.buscarJogadorMaisVelho((long) 11));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println(desafio.buscarJogadorMaisVelho((long) 13));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		try {
			System.out.println(desafio.buscarJogadorMaisVelho((long) 1100));

		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Busca times

		System.out.println("");
		System.out.println("Buscando times");

		System.out.println(desafio.buscarTimes());

		// Busca jogador com maior salario

		System.out.println("");
		System.out.println("Buscando jogador com maior salario");
		try {
			System.out.println(desafio.buscarJogadorMaiorSalario((long) 10));
		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Busca salario do jogador
		System.out.println("");
		System.out.println("Buscando salario do jogador");
		try {
			System.out.println(desafio.buscarSalarioDoJogador((long) 2));
		} catch (JogadorNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}
		// Busca top jogadores
		System.out.println("");
		System.out.println("Buscando jogadores top");
		System.out.println(desafio.buscarTopJogadores(5));

		// Busca cor camisa
		System.out.println(desafio.buscarCorCamisaTimeDeFora((long) 10, (long) 11));

		// Definir capitao
		try {
			desafio.definirCapitao((long) 2);
		} catch (JogadorNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}

		// Mostrar capitao

		try {
			desafio.buscarCapitaoDoTime((long) 10);
		} catch (CapitaoNaoInformadoException e) {

			System.out.println(e.getMessage());
		} catch (TimeNaoEncontradoException e) {

			System.out.println(e.getMessage());
		}
		


	}
}
