package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.Date;

public class Sessao {
	
	private static int proximoId = 1;
	
	private int id;
	private Date data;
	private String descricao;
	
	public Sessao(Date data, String descricao) {
		this.id = proximoId++;
		this.data = data;
		this.descricao = descricao;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao != null && !descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
			throw new IllegalArgumentException("Descrição inválida!");
		}
	}

}
