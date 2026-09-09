package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
	
	private static int proximoId = 1;
	
	private int id;
	private String nome;
	private int nivel;
	private int vida;
	private List<Item> itens;
	private Personagem mentor;
	
	public Personagem(String nome, int nivel, int vida, List<Item> itens, Personagem mentor) {
		this.id = proximoId++;
		this.nome = nome;
		this.nivel = nivel;
		this.vida = vida;
		this.itens = itens != null ? itens : new ArrayList<>();
		this.mentor = mentor;
	}

	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome inválido");
		}
	}
	
	public int getNivel() {
		return this.nivel;
	}
	
	public void setNivel(int nivel) {
		if(nivel >= 0) {
			this.nivel = nivel;
		} else {
			throw new IllegalArgumentException("Nível inválido!");
		}
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		if(vida >= 0) {
			this.vida = vida;
		} else {
			throw new IllegalArgumentException("Vida inválida!");
		}
	}
	
	public void receberDano(int dano) {
	    if (dano < 0) {
	        throw new IllegalArgumentException("Dano inválido!");
	    }

	    vida -= dano;

	    if (vida < 0) {
	        vida = 0;
	    }
	}
	
	public void curar(int valor) {
	    if (valor < 0) {
	        throw new IllegalArgumentException("Valor de cura inválido!");
	    }

	    vida += valor;
	}
	
	public void adicionarItem(Item item) {
		if(item != null) {
			itens.add(item);
		}
	}
	
	public boolean removerItem(Item item) {
		return itens.remove(item);
	 
	}
	
	public List<Item> listarItens() {
	    return this.itens;
	}
	
	public void definirMentor(Personagem mentor) {
		this.mentor = mentor;
	}
	
	public Personagem getMentor() {
		return this.mentor;
	}
	
	public String atacar() {
		return "Personagem atacando!";
		
	}
	
	

}
