/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;
import java.util.Scanner;

/**
 *
 * @author LCP
 */
public class Divisible
{
public void EjemploIf(){    
    int n, d;
    Scanner entrada = new Scanner (System.in);
    System.out.println("ingresa 2 enteros");
    n = entrada.nextInt();
    d = entrada.nextInt();
    if(n%d == 0){
    System.out.println(n + "es divisible por " + d);
    }
}
    public static void main(String[] args){
       Divisible divisible = new Divisible();
       divisible.EjemploIf();
    }
    
}
