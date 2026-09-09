package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private Long id;
	private String nome;
	private List<Personagem> personagens;
	
	public Jogador(Long id, String nome) {
	    this.id = id;
	    this.nome = nome;
	    this.personagens = new ArrayList<>();
	}

	public Long getId() {
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
	
	public Personagem buscarPersonagem(Long id) {
	    for (Personagem personagem : personagens) {
	        if (personagem.getId().equals(id)) {
	            return personagem;
	        }
	    }
	    
	    return null;
	}
	
	public List<Personagem> listarPersonagens() {
		return this.personagens;
	}
	
	public boolean removerPersonagem(Long id) {
	    Personagem personagem = buscarPersonagem(id);
	    
	    if(personagem != null) {
	    	personagens.remove(personagem);
	    	return true;
	    }
	    return false;
	}
	
	

}
