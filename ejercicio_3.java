/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_3 {
     public static double convertirDolaresAEuros(double dolares) {
        return dolares * 1.33250;
    }

    public static void main(String[] args) {
        // Casos de prueba
        double dolares1 = 100;
        System.out.println("Cambio de dólares a euros (Caso 1): " + convertirDolaresAEuros(dolares1));

        double dolares2 = 250;
        System.out.println("Cambio de dólares a euros (Caso 2): " + convertirDolaresAEuros(dolares2));
    }
}
