package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.List;

public class Mago extends Personagem implements Atacante {
	
	private int inteligencia;

	public Mago(String nome, int nivel, int vida, List<Item> itens, Personagem mentor, int inteligencia) {
		super(nome, nivel, vida, itens, mentor);
		this.inteligencia = inteligencia;
	}

	public int getInteligencia() {
		return this.inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		if(inteligencia >= 0) {
			this.inteligencia = inteligencia;
		} else {
			throw new IllegalArgumentException("Inteligencia inválida!");
		}
	}

	@Override
	public String atacar() {
		return "Mago atacando com inteligência " + inteligencia + "!";
	}

}
