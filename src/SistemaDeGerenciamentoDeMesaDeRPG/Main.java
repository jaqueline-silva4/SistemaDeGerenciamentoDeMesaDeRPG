package SistemaDeGerenciamentoDeMesaDeRPG;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Mestre mestre = new Mestre("José");
		
		System.out.println("===MESTRE===");
		System.out.println(mestre.narrar("Bem -vindos à aventura!"));
		
		Mesa mesa = new Mesa("Aventura nas Terras perdidas", mestre);
		System.out.println("\n===MESA===");
		System.out.println("Nome: " + mesa.getNome());
		System.out.println("Mestre: " + mesa.getMestre().getNome());
		
		Item espada = new Item("Espada Longa", "Arma");
		Item pocao = new Item("Poção de vida", "Poção");
		Item arco = new Item("Arco Élfico", "Arma");
		
		Guerreiro guerreiro = new Guerreiro("Thor", 5, 100, new ArrayList<>(), null, 20);
		Mago mago = new Mago("Elena", 4, 80, new ArrayList<>(), null, 25);
		Arqueiro arqueiro = new Arqueiro("Legolas", 6, 90, new ArrayList<>(), null, 30);
		
		guerreiro.adicionarItem(espada);
		guerreiro.adicionarItem(pocao);
		arqueiro.adicionarItem(arco);
		
		guerreiro.definirMentor(mago);
		System.out.println("\n===MENTOR===");
		System.out.println(guerreiro.getNome() + " possui como mentor(a) " + guerreiro.getMentor().getNome());
		
		Jogador jogador1 = new Jogador("Guilherme");
		Jogador jogador2 = new Jogador("Carla");
		Jogador jogador3 = new Jogador("Bruno");
		
		jogador1.adicionarPersonagem(guerreiro);
		jogador2.adicionarPersonagem(mago);
		jogador3.adicionarPersonagem(arqueiro);
		
		mesa.adicionarJogador(jogador1);
		mesa.adicionarJogador(jogador2);
		mesa.adicionarJogador(jogador3);
		
		System.out.println("\n===JOGADORES DA MESA===");
		for(Jogador jogador : mesa.listarJogadores()) {
			System.out.println("Jogador: " + jogador.getNome());
			
			for(Personagem personagem : jogador.listarPersonagens()) {
				System.out.println(" Personagem: " + personagem.getNome());
			}
		}
		
		Participacao participacao1 = new Participacao("Jogador", new Date());
		Participacao participacao2 = new Participacao("Jogador", new Date());
		
		mesa.adicionarParticipacao(participacao1);
		mesa.adicionarParticipacao(participacao2);
		
		System.out.println("\n===PARTICIPAÇÕES===");
		
		for(Participacao participacao : mesa.listarParticipacoes()) {
			System.out.println("Papel: " + participacao.getPapel());
			System.out.println("Data de entrada: " + participacao.getDataEntrada());
		}
		
		Sessao sessao1 = mesa.criarSessao(new Date(), "Os Jogadores chegam à floresta.");
		Sessao sessao2 = mesa.criarSessao(new Date(), "O grupo encontra um grupo de goblins.");
		
		System.out.println("\n===SESSÕES===");
		
		for(Sessao sessao : mesa.listarSessoes()) {
			System.out.println("Sessão " + sessao.getId());
			System.out.println("Descrição: " + sessao.getDescricao());
		}
		
		System.out.println("\n===ATAQUES===");
		
		System.out.println(guerreiro.atacar());
		System.out.println(mago.atacar());
		System.out.println(arqueiro.atacar());
		
		System.out.println("\n===VIDA DOS PERSONAGENS===");
		
		System.out.println("Vida inicial do guerreiro: " + guerreiro.getVida());
		guerreiro.receberDano(30);
		System.out.println("Após receber 30 de dano " + guerreiro.getVida());
		guerreiro.curar(20);
		System.out.println("Após recuperar 20 de vida " + guerreiro.getVida());
		
		System.out.println("\n===ITENS DO GUERREIRO===");
		for(Item item : guerreiro.listarItens()) {
			System.out.println(item.getNome() + " - " + item.getTipo());
		}
		
		System.out.println("\n===BUSCA DE PERSONAGEM===");
		Personagem personagemEncontrado = jogador1.buscarPersonagem(1);
		
		if(personagemEncontrado != null) {
			System.out.println("Personagem encontrado: " + personagemEncontrado.getNome());
		} else {
			System.out.println("Personagem não encontrado");
		}
		
				
		
	}

}
