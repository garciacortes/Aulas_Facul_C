import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int nota1, nota2, nota3;
		
		System.out.println("********* Dados do Aluno *********");
		System.out.printf("Digite o nome do aluno: ");
		nome = scan.next();
		System.out.printf("Digite a nota 1: ");
		nota1 = scan.nextInt();
		System.out.printf("Digite a nota 2: ");
		nota2 = scan.nextInt();
		System.out.printf("Digite a nota 3: ");
		nota3 = scan.nextInt();
		
		Aluno objetoAluno; // declaração do objeto
		objetoAluno = new Aluno(nome, nota1, nota2, nota3);
		
		System.out.println("********* Boletim Final ********");
		System.out.println("Aluno " + objetoAluno.RetornaNome() + " esta " + objetoAluno.ResultadoFinal());
	}

}
