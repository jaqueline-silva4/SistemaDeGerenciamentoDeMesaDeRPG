package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;

public class Mago extends Personagem implements Atacante {
	
	private int inteligencia;

	public Mago(Long id, String nome, int nivel, int vida, ArrayList<Item> itens, Personagem mentor, int inteligencia) {
		super(id, nome, nivel, vida, itens, mentor);
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
	public void atacar(String atacar) {
		System.out.println("Mago atacando!");		
		
	}

}
