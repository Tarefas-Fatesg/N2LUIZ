/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
2- Seja a série de Fibonacci:
1,1,2,3,5,8,13,21,34,55, ...
que pode ser definida recursivamente por:
Fib n =

* 1,se	n = 1	ou	n = 2
Fib (n − 1) + Fib(n − 2),se	n > 2
	

Então escreva:

-Uma função recursiva que gere o termo de ordem n da série de Fibonacci;
-Um algoritmo que, utilizando a função definida acima gere a série de Fibonacci
até o termo de ordem 20.
 */
public class Ex2 {
     public static int Ex2a(int n){
     if(n==1 || n==2){
         return 1;
     }else{
      
         return Ex2a(n-1)+Ex2a(n-2);
        
     }
         
     }
     
    public static int Ex2b(){
    int n=20;
    
       return  Ex2a(n);
    
    
    
    
    }
    
}
