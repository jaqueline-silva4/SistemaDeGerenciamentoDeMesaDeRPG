package SistemaDeGerenciamentoDeMesaDeRPG;

public class Mestre {
	
	private static int proximoId = 1;
	
	private int id;
	private String nome;

	public Mestre(String nome) {
		this.id = proximoId++;
		this.nome = nome;
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
	
	public String narrar(String mensagem) {
		return "Mestre " + nome + ": " + mensagem;
	}

}
