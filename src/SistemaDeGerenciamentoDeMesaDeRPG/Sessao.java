package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.Date;

public class Sessao {
	
	private Long id;
	private Date data;
	private String descricao;
	
	public Sessao(Long id, Date data, String descricao) {
		this.id = id;
		this.data = data;
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
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
