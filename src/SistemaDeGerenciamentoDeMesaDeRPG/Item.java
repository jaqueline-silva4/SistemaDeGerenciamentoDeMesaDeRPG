package SistemaDeGerenciamentoDeMesaDeRPG;

public class Item {
	
	private static int proximoId = 1;
	
	private int id;
	private String nome;
	private String tipo;
	
	public Item(String nome, String tipo) {
		this.id = proximoId++;
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public int getNumber() {
		return this.id;
	}
	
	public void setNumber(int id) {
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
