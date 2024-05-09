import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		String CaminhoArquivo = "";
		String TextoAnalisado;
		Lexer objLexer = new Lexer();
		
		JFileChooser filechooser = new JFileChooser();
		
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos texto (*.text)", "txt");
		filechooser.setFileFilter(filter);
		
		int returnValue = filechooser.showOpenDialog(null);
		
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = filechooser.getSelectedFile();
			System.out.println("\n ====> Arquivo selecionado: " + selectedFile.getAbsolutePath());
			objLexer.AnalisadorLexico(selectedFile);
		} else {
			System.out.println("Nenhum arquivo selecionado.");
		}
	}
}
