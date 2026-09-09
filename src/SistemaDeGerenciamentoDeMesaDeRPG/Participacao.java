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

	public Date getDataEntrada() {
		return this.dataEntrada;
	}

}
