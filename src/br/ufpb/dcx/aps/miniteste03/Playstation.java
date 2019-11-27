package br.ufpb.dcx.aps.miniteste03;

public class Playstation implements VideoGame {

	@Override
	public String infoVideoGame() {
		return "Empresa: Sony \nModelo: Playstation\n";
	}

	@Override
	public Game infoGame() {
		return new ShadowOfTheColossus();
	}

}
