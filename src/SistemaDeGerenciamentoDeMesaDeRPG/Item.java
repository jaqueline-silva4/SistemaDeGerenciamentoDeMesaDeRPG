package SistemaDeGerenciamentoDeMesaDeRPG;

public class Item {
	
	private Long id;
	private String nome;
	private String tipo;
	
	public Item(Long id, String nome, String tipo) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public Long getNumber() {
		return this.id;
	}
	
	public void setNumber(Long id) {
		if(id >= 0) {
			this.id = id;
		} else {
			throw new IllegalArgumentException("ID inválido!");
		}
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
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		} else {
			throw new IllegalArgumentException("Tipo inválido");
		}
	}

}
