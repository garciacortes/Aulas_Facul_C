
public class Aluno {
	
	private int totalAlunos, reprovados;
	private double[][] notas;
	private double media;
	
	public Aluno(int qtde) {
		totalAlunos = qtde;
		notas = new double[totalAlunos][];
	}
	
	public void InsereNotas(double nota, int index) {
		if(notas[index] == null) {
			notas[index] = new double[1];
		}
		else {
			double[] temp = new double[notas[index].length + 1];
			System.arraycopy(notas[index], 0, temp, 0, notas[index].length);
			notas[index] = temp;
		}
		
		notas[index][notas[index].length - 1] = nota;
	}
	
	public double Media() {
		
		double somaTotal;
		int count = 0;
		
		somaTotal = 0;
		
		for (int i = 0; i < totalAlunos; i++) {
		    if (notas[i] != null) {
		        for (int j = 0; j < notas[i].length; j++) {
		            double nota = notas[i][j];
		            somaTotal += nota;
		            count++;
		        }
		    }
		}
		
		double mediaTotal = somaTotal / count;
		return mediaTotal;
	}
	
	public double[] MediaAcima(double valor) {
		
		double somaAluno = 0;
		int countNotas = 0;
		double []mediaAcima;
		reprovados = 0;
		
		mediaAcima = new double[totalAlunos];
		
		for (int i = 0; i < totalAlunos; i++) {
		    if (notas[i] != null) {
		        for (int j = 0; j < notas[i].length; j++) {
		            double nota = notas[i][j];
		            somaAluno += nota;
		            countNotas++;
		        }
		    }
		    mediaAcima[i] = somaAluno / countNotas;
		    if((somaAluno / countNotas) < 4) {
		    	reprovados++;
		    }
		}
		
		return mediaAcima;
	}
	
	public int Reprovados() {
		return reprovados;
	}
}


