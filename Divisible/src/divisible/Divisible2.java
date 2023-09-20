/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisible;

import java.util.Scanner;

public class Divisible2{
    public static void main(String[] args){
    int n, d;
    Scanner entrada = new Scanner (System.in);
    System.out.println("ingresa el 1er valor");
    n = entrada.nextInt();
    System.out.println("ingresa el 2do valor");
    d = entrada.nextInt();
    
    if(n%d ==0){
        System.out.println(n + "es divisible por " + d);
    } else {
        System.out.println(n + "no es divisible por " + d);
        }
    }
}

