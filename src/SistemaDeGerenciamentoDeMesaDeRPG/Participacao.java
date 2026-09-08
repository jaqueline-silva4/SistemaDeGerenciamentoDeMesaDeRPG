package SistemaDeGerenciamentoDeMesaDeRPG;

import java.time.LocalDate;

public class Participacao {
	
	private String papel;
	private LocalDate dataEntrada;
	
	public Participacao(String papel, LocalDate dataEntrada) {
		this.papel = papel;
		this.dataEntrada = dataEntrada;
	}

	public String getPapel() {
		return this.papel;
	}

	public void setPapel(String papel) {
		if (papel != null & !papel.isEmpty()) {
			this.papel = papel;
		} else {
			throw new IllegalArgumentException("Nome inválido");
		}
	}

	public LocalDate getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

}
