package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.Date;

public class Participacao {
	
	private String papel;
	private Date dataEntrada;
	
	public Participacao(String papel, Date dataEntrada) {
		this.papel = papel;
		this.dataEntrada = dataEntrada;
	}

	public String getPapel() {
		return this.papel;
	}

	public void setPapel(String papel) {
		if (papel != null && !papel.isEmpty()) {
			this.papel = papel;
		} else {
			throw new IllegalArgumentException("Nome inválido");
		}
	}

	public Date getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

}
