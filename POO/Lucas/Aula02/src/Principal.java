import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno []vetorObjetoAluno;
		
		System.out.println("Digite a quantidade de Alunos: ");
		int qtdeAlunos = scan.nextInt();
		
		vetorObjetoAluno = new Aluno[qtdeAlunos];
		
		String nome;
		int nota1, nota2, nota3;
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.println("********* Dados do Aluno ********");
			System.out.println("Digite o nome do aluno: ");
			nome = scan.next();
			System.out.println("Digite a nota 1: ");
			nota1 = scan.nextInt();
			System.out.println("Digite a nota 2: ");
			nota2 = scan.nextInt();
			System.out.println("Digite a nota 3: ");
			nota3 = scan.nextInt();
			
			//INSTANCIAR O OBJETO PARA CADA POSIÇÃO DO VETOR
			vetorObjetoAluno[i] = new Aluno(nome, nota1, nota2, nota3);
		}
		
		System.out.println("********** Boletim Final ********** ");
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.println("Aluno " + vetorObjetoAluno[i].RetornaNome() + " está " + vetorObjetoAluno[i].ResultadoFinal());
		}

	}

}
