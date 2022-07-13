package br.com.generation.exercicio02;

public class TestaAviao {
	
	private int horario;
	private String destino;
	private int chegada ;
	

	public int getHorario() {
		return horario;
	}


	public void setHorario(int horario) {
		this.horario = horario;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public int getChegada() {
		return chegada;
	}


	public void setChegada(int chegada) {
		this.chegada = chegada;
	}


	void agendaAviao() {
		System.out.println("Chegou ao seu destino...");
	}
}
