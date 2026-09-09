package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.List;

public class Arqueiro extends Personagem implements Atacante {
	
	private int precisao;

	public Arqueiro(Long id, String nome, int nivel, int vida, List<Item> itens, Personagem mentor, int precisao) {
		super(id, nome, nivel, vida, itens, mentor);
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
