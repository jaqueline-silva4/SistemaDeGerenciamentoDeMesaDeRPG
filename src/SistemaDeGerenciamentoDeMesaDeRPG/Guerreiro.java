package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;

public class Guerreiro extends Personagem implements Atacante {
	
	private int forca;

	public Guerreiro(Long id, String nome, int nivel, int vida, ArrayList<Item> itens, Personagem mentor, int forca) {
		super(id, nome, nivel, vida, itens, mentor);
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
	public void atacar(String atacar) {
		System.out.println("Guerreiro atacando!");		
		
	}

}
