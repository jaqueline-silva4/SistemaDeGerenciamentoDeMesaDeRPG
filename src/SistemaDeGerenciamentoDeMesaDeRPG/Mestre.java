package SistemaDeGerenciamentoDeMesaDeRPG;

public class Mestre {
	
	private Long id;
	private String nome;

	public Mestre(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
	public String narrar(String mensagem) {
		return mensagem;
	}

}
