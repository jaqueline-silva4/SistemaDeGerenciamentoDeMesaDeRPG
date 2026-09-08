package SistemaDeGerenciamentoDeMesaDeRPG;

import java.time.LocalDate;

public class Sessao {
	
	private Long id;
	private LocalDate data;
	private String descricao;
	
	public Sessao(Long id, LocalDate data, String descricao) {
		this.id = id;
		this.data = data;
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao != null && descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
			throw new IllegalArgumentException("Descrição inválida!");
		}
	}

}
