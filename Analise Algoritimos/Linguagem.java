
public class Linguagem {

	boolean VerificarPalavra(String palavra) {
		int contA = 0;
		int contB = 0;
		int contC = 0;
		boolean pertence = false;
		int temp = 0;
		
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a') {
				System.out.println("Entrou A");
				contA++;
				temp += 1;
			}
		}
			
		for(int i = contA-1; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'b') {
				System.out.println("Entrou b");
				contB++;
				temp += 1;
			}
		}
			
		for(int i = (contA + contB -1); i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'c' ) {
				System.out.println("Entrou C");
				contC++;
				temp += 1;
				System.out.println(contC);
			}
			
		}
		System.out.println(contA);
		System.out.println(contB);
		System.out.println(contC);
		if(contA >= 1) {
			if((contA == contB) && (contA == contC)) {
				pertence = true;
			} else {
				pertence = false;
			}
			return pertence;
		}
		return pertence;
	}
}
