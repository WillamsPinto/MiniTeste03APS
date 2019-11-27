package br.ufpb.dcx.aps.miniteste03;

public class Nintendo implements EmpresaDeVideoGame{

	@Override
	public VideoGame criarVideoGame() {
		return new Switch();
	}

}
