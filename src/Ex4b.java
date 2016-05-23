/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/**
 public void func(int n)
{
if ( n == 0 )
System.out.println(“Fim”);else {
func(n-1);
System.out.println(n);
func(n-1);
}
}
 */
public class Ex4b {

  public  static void func(int n)
{
if ( n == 0 )
System.out.println("Fim");else {
func(n-1);
System.out.println(n);
func(n-1);
}
}

}
/*
10 descresce para 9
9 descresce para 8
8 descresce para 7
7 descresce para 6
6 descresce para 5
5 descresce para 4
4 descresce para 3
3 descresce para 2
2 descresce para 1
1 descresce para 0
Fim
*/