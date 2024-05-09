
public class ClassificacaoLexica {
	
	public String Lexema;
	public int Linha;
	public Token Token;
	
	public ClassificacaoLexica(String lexema, Token token, int linha) {
		this.Lexema = lexema;
		this.Token = token;
		this.Linha = linha;
	}
}
