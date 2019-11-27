package br.ufpb.dcx.aps.miniteste03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaVideoGameTest {

	@Test
	void testTelaVideoGame() {
		TelaVideoGame tela = new TelaVideoGame();
		tela.setVideoGame(new Playstation());
		
		assertEquals("Empresa: Sony \nModelo: Playstation", tela.infoConsole());
	}

}
