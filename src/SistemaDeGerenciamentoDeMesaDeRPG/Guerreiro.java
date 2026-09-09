package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.List;

public class Guerreiro extends Personagem implements Atacante {
	
	private int forca;

	public Guerreiro(String nome, int nivel, int vida, List<Item> itens, Personagem mentor, int forca) {
		super(nome, nivel, vida, itens, mentor);
		this.forca = forca;
	}

	public int getForca() {
		return this.forca;
	}

	public void setForca(int forca) {
		if(forca >= 0) {
			this.forca = forca;
		} else {
			throw new IllegalArgumentException("Força inválida!");
		}
	}

	@Override
	public String atacar() {
		return "Guerreiro atacando com força " + forca + "!";
		
	}

}
