package br.ufpb.dcx.aps.miniteste03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscolhaVideoGameTest {

	@Test
	void testVideoGamePlastation() {
		EscolhaVideoGame console = new EscolhaVideoGame();
		console.setVideoGame(new Playstation());
		
		assertEquals("Empresa: Sony \nModelo: Playstation\n"+"Game:\nNome: Shadow Of the Colossus\nCategoria: Aventura\nExclusivo da Plastation!", console.infoConsole());
	}
	
	@Test
	void testVideoGameXbox() {
		EscolhaVideoGame console = new EscolhaVideoGame();
		console.setVideoGame(new Xbox());
		
		assertEquals("Empresa: Microsoft \nModelo: Xbox\n"+"Game:\nNome: Halo\nCategoria: Ação,Aventura\nExclusivo do Xbox!", console.infoConsole());
	}
	
	@Test
	void testVideoGameNintendo() {
		EscolhaVideoGame console = new EscolhaVideoGame();
		console.setVideoGame(new Switch());
		
		assertEquals("Empresa: Nintendo \nModelo: Switch\n"+"Game:\nNome: Super Smash Bros:Ultimate\nCategoria: Ação\nExclusivo da Nintendo!", console.infoConsole());
	}

}
