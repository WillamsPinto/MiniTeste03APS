package br.ufpb.dcx.aps.miniteste03;

public class Microsoft implements EmpresaDeVideoGame{

	@Override
	public VideoGame criarVideoGame() {
		return new Xbox();
	}

}
