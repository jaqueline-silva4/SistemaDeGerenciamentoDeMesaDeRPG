package SistemaDeGerenciamentoDeMesaDeRPG;

public class Item {
	
	private Long number;
	private String nome;
	private String tipo;
	
	public Item(Long number, String nome, String tipo) {
		this.number = number;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public Long getNumber() {
		return this.number;
	}
	
	public void setNumber(Long number) {
		if(number >= 0) {
			this.number = number;
		} else {
			throw new IllegalArgumentException("Number inválido!");
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
