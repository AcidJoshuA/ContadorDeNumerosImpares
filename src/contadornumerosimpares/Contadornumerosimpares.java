/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornumerosimpares;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Contadornumerosimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);       
    System.out.print("Ingresar un número: ");
    int numero = scanner.nextInt();
    if (numero <= 0){
    System.out.println("ingresa un número: ");
    }else{
    int i = 1;  
    System.out.println("Los números impares desde 1 hasta " + numero + " son:");
    do {          
    System.out.println(i);
    i += 2;  
    } while (i <= numero);  
   }
 }  
}
