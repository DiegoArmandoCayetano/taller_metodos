/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_2 {
    public static double calcularPerimetro(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }

    public static double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static void main(String[] args) {
        // Casos de prueba
        double lado1_1 = 5;
        double lado2_1 = 10;
        System.out.println("Perímetro del rectángulo (Caso 1): " + calcularPerimetro(lado1_1, lado2_1));
        System.out.println("Área del rectángulo (Caso 1): " + calcularArea(lado1_1, lado2_1));

        double lado1_2 = 7;
        double lado2_2 = 15;
        System.out.println("Perímetro del rectángulo (Caso 2): " + calcularPerimetro(lado1_2, lado2_2));
        System.out.println("Área del rectángulo (Caso 2): " + calcularArea(lado1_2, lado2_2));
    }
}
