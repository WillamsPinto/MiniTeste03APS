package br.ufpb.dcx.aps.miniteste03;

public class Sony implements EmpresaDeVideoGame{

	@Override
	public VideoGame criarVideoGame() {
		return new Playstation();
	}

}
