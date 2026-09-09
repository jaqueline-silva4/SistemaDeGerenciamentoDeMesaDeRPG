package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.List;

public class Arqueiro extends Personagem implements Atacante {
	
	private int precisao;

	public Arqueiro(String nome, int nivel, int vida, List<Item> itens, Personagem mentor, int precisao) {
		super(nome, nivel, vida, itens, mentor);
		this.precisao = precisao;
	}

	public int getPrecisao() {
		return this.precisao;
	}

	public void setPrecisao(int precisao) {
		if(precisao >= 0) {
			this.precisao = precisao;
		} else {
			throw new IllegalArgumentException("Precisao inválida!");
		}
	}

	@Override
	public String atacar() {
		return "Arqueiro atacando com precisão " + precisao + "!";
	}

}
