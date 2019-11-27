package br.ufpb.dcx.aps.miniteste03;

public class Switch implements VideoGame {

	@Override
	public String infoVideoGame() {
		return  "Empresa: Nintendo \nModelo: Switch\n";
	}

	@Override
	public Game infoGame() {
		return new SuperSmashBrosUltimate();
	}

}
