/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_17;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio,area,longitud;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = Entrada.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        longitud = Math.PI*radio*2;
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
    
}
