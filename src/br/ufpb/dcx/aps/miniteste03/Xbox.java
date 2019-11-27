package br.ufpb.dcx.aps.miniteste03;

public class Xbox implements VideoGame {

	@Override
	public String infoVideoGame() {
		return  "Empresa: Microsoft \nModelo: Xbox\n";
	}

	@Override
	public Game infoGame() {
		return new Helo();
	}

}
