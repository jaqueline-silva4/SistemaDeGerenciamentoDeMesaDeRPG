package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private static int proximoId = 1;
	
	private int id;
	private String nome;
	private List<Personagem> personagens;
	
	public Jogador(String nome) {
	    this.id = proximoId++;
	    this.nome = nome;
	    this.personagens = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome inválido!");
		}
	}
	
	public void adicionarPersonagem(Personagem personagem) {
		if(personagem != null) {
			personagens.add(personagem);
		}
	}
	
	public Personagem buscarPersonagem(int id) {
	    for (Personagem personagem : personagens) {
	        if (personagem.getId() == id) {
	            return personagem;
	        }
	    }
	    
	    return null;
	}
	
	public List<Personagem> listarPersonagens() {
		return this.personagens;
	}
	
	public boolean removerPersonagem(int id) {
	    Personagem personagem = buscarPersonagem(id);
	    
	    if(personagem != null) {
	    	personagens.remove(personagem);
	    	return true;
	    }
	    return false;
	}
	
	

}
