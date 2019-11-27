package br.ufpb.dcx.aps.miniteste03;

public class TelaVideoGame {
	private VideoGame videoGame;
	
	public void setVideoGame(VideoGame console) {
		this.videoGame = console;
	}
	
	public String infoConsole() {
		return this.videoGame.infoVideoGame();
	}

}
