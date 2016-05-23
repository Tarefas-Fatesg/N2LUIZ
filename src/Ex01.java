/*-
Considere o método abaixo:
	public int X(int a)
	{
		if ( a <= 0 )
			return 0;
		else
			return a + X(a-1);
	}
A. O que essa função faz?
	A função recebe um número inteiro e equanto ele for menor que 0 ele decrementa 1.
	 
B. Escreva uma função não-recursiva que resolve o mesmo problema.
	

C. Qual implementação é mais eficiente? Justifique.
	Depende do valor inserido caso seja muito grande a pilha do modo recursivo vai ocupar
	mais memória que o modo iterativo.

*/
public class Ex01 {

//	@ Respota da B.
	public int x(int a){
		while (a <= 0) {
			a--;
		}
		return a;
	}
	
}
