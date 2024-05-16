import java.util.ArrayList;

public class RegrasSintaticas {
	
	boolean Inicio(ArrayList<ClassificacaoLexica> VetorAnaliseLexica) {
		
		int Tamanho = VetorAnaliseLexica.size();
		
		if((VetorAnaliseLexica.get(0).Token == Token.VOID) && (VetorAnaliseLexica.get(1).Token == Token.MAIN) &&
		   (VetorAnaliseLexica.get(2).Token == Token.ABREPARENTESE) && (VetorAnaliseLexica.get(3).Token == Token.FECHAPARENTESE) &&
		   (VetorAnaliseLexica.get(4).Token == Token.ABRECHAVE) && (VetorAnaliseLexica.get(Tamanho - 1).Token == Token.FECHACHAVE)) {
			return true;
		} else {
			return false;
		}
	}
	 
	boolean DeclaracaoVariavel(ArrayList<ClassificacaoLexica> VetorAnaliseLexica) {
		
		if((VetorAnaliseLexica.get(0).Token == Token.TIPOVARIAVEL) && (VetorAnaliseLexica.get(1).Token == Token.VARIAVEL) &&
		   (VetorAnaliseLexica.get(2).Token == Token.PONTOVIRGULA)) {
			return true;
		}
		
		int tamanho = VetorAnaliseLexica.size();
		
		if(tamanho < 5) {
			return false;
		}
		
		if((VetorAnaliseLexica.get(0).Token == Token.TIPOVARIAVEL) && (VetorAnaliseLexica.get(1).Token == Token.VARIAVEL) &&
		   (VetorAnaliseLexica.get(2).Token == Token.VIRGULA) && (VetorAnaliseLexica.get(3).Token == Token.VARIAVEL) && 
		   (VetorAnaliseLexica.get(4).Token == Token.PONTOVIRGULA)) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean ComandoAtribuicao(ArrayList<ClassificacaoLexica> VetorAnaliseLexica) {
		
		int tamanho = VetorAnaliseLexica.size();
		if(tamanho < 4) {
			return false;
		}
		
		if((VetorAnaliseLexica.get(0).Token == Token.VARIAVEL) && (VetorAnaliseLexica.get(1).Token == Token.ATRIBUICAO) &&
		   (VetorAnaliseLexica.get(2).Token == Token.NUMEROINTEIRO) && (VetorAnaliseLexica.get(3).Token == Token.PONTOVIRGULA)) {
			return true;
		}
		
		if(tamanho < 6) {
			return false;
		}
		
		if((VetorAnaliseLexica.get(0).Token == Token.VARIAVEL) && (VetorAnaliseLexica.get(1).Token == Token.ATRIBUICAO) &&
		   (VetorAnaliseLexica.get(2).Token == Token.VARIAVEL) && (VetorAnaliseLexica.get(3).Token == Token.OPERADORESMATEMATICO) &&
		   (VetorAnaliseLexica.get(4).Token == Token.NUMEROINTEIRO) && (VetorAnaliseLexica.get(5).Token == Token.PONTOVIRGULA)) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean ComandoEspecifico(ArrayList<ClassificacaoLexica> VetorAnaliseLexica) {
		
		int tamanho = VetorAnaliseLexica.size();
		
		if(tamanho < 5) {
			return false;
		}
		
		if((VetorAnaliseLexica.get(0).Token == Token.IMPRIMIR) && (VetorAnaliseLexica.get(1).Token == Token.ABREPARENTESE) &&
		   (VetorAnaliseLexica.get(2).Token == Token.VARIAVEL) && (VetorAnaliseLexica.get(3).Token == Token.FECHAPARENTESE) &&
		   (VetorAnaliseLexica.get(0).Token == Token.PONTOVIRGULA)) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean Programa(ArrayList<ClassificacaoLexica> VetorAnaliseLexica) {
		
		if(DeclaracaoVariavel(VetorAnaliseLexica)) {
			System.out.println("DECLARACAOVARIAVEL - ");
			return true;
		}
		if(ComandoAtribuicao(VetorAnaliseLexica)) {
			System.out.println("COMANDOATRIBUICAO - ");
			return true;
		}
		if(ComandoEspecifico(VetorAnaliseLexica)) {
			System.out.println("COMANDOPRINTF - ");
			return true;
		}
		
		else {
			return false;
		}
	}
}
