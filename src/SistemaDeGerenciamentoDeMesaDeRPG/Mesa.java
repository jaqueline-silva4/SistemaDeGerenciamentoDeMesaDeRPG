package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mesa {
	
	private Long id;
	private String nome;
	private List<Jogador> jogadores;
	private List<Participacao> participacoes;
	private List<Sessao> sessoes;
	private Mestre mestre;
	
	public Mesa(Long id, String nome, Mestre mestre) {
		this.id = id;
		this.nome = nome;
		this.mestre = mestre;
		this.jogadores = new ArrayList<>();
		this.participacoes = new ArrayList<>();
		this.sessoes = new ArrayList<>();
		
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Mestre getMestre() {
		return this.mestre;
	}

	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}

	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public List<Jogador> listarJogadores(){
		return jogadores;
	}
	
	public void adicionarParticipacao(Participacao participacao) {
		participacoes.add(participacao);
	}
	
	public List<Participacao> listarParticipacoes(){
		return participacoes;
	}
	
	public Sessao criarSessao(Date data, String descricao) {
		Sessao sessao = new Sessao((long) sessoes.size() + 1, data, descricao);
		sessoes.add(sessao);
		return sessao;
	}
	
	public List<Sessao> listarSessoes(){
		return sessoes;
	}

}
