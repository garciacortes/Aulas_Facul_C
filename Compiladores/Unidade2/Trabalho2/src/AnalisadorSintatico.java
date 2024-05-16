import java.util.ArrayList;

public class AnalisadorSintatico {
	
	RegrasSintaticas objRegrasSintaticas;
	ArrayList<ClassificacaoLexica> VetorAnaliseLexica;
	
	public AnalisadorSintatico() {
		objRegrasSintaticas = new RegrasSintaticas();
		VetorAnaliseLexica = Lexer.listAnaliseLexica;
	}
	
	void AnaliseSintatica() {
		if(objRegrasSintaticas.Inicio(VetorAnaliseLexica)) {
			int Tamanho = VetorAnaliseLexica.size();
			int QuantidadeTotalLinhas = VetorAnaliseLexica.get(Tamanho - 1).Linha;
			int LinhaAtual = 3;
			boolean ProgramaSemErros = true;
			int QuantidadeErros = 0;
			
			ArrayList<ClassificacaoLexica> VetorAnalise = new ArrayList<ClassificacaoLexica>();
			while(LinhaAtual <= QuantidadeTotalLinhas - 1) {
				
				for(ClassificacaoLexica e : VetorAnaliseLexica) {
					if(e.Linha == LinhaAtual) {
						VetorAnalise.add(e);
					}
					
				}
				
				if(!objRegrasSintaticas.Programa(VetorAnalise)) {
					ProgramaSemErros = false;
					QuantidadeErros++;
					System.out.println("**ERRO SINTATICO");
				}
				
				System.out.println("Linha: " + LinhaAtual + " ");
				VetorAnalise.forEach(e -> System.out.println(e.Lexema + " "));
				
				System.out.println(" ");
				LinhaAtual++;
			}
			
			if(ProgramaSemErros) {
				System.out.println(" \n Analise Sintatica concluida com sucesso! ZERO erros");
			} else {
				System.out.println("\n Quantidade de Erros: " + QuantidadeErros);
			}
		} else {
			System.out.println("Erro na linha 1 - Inicialização do Programa");
		}
	}
}
