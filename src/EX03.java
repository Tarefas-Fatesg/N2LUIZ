/*
 * 3- Usando recursividade, calcule a soma de todos os valores de um array de n números
 * inteiros.
 * 
 * */
public class EX03 {

	
	public int soma(int vetor[], int aux) {
		if (aux == 0)
			return 0;
		else {
			int s;
			s = soma(vetor, aux - 1);
			if (vetor[aux - 1] > 0)
				s += vetor[aux - 1];
			return s;
		}
	}
}
