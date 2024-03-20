/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_4 {
   public static final double PI = 3.1416;

    public static double calcularPerimetroCircunferencia(double radio) {
        return 2 * PI * radio;
    }

    public static double calcularAreaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4 * PI * Math.pow(radio, 3)) / 3;
    }

    public static void main(String[] args) {
        // Casos de prueba
        double radio1 = 5;
        System.out.println("Perímetro de la circunferencia (Caso 1): " + calcularPerimetroCircunferencia(radio1));
        System.out.println("Área del círculo (Caso 1): " + calcularAreaCirculo(radio1));
        System.out.println("Volumen de la esfera (Caso 1): " + calcularVolumenEsfera(radio1));

        double radio2 = 7;
        System.out.println("Perímetro de la circunferencia (Caso 2): " + calcularPerimetroCircunferencia(radio2));
        System.out.println("Área del círculo (Caso 2): " + calcularAreaCirculo(radio2));
        System.out.println("Volumen de la esfera (Caso 2): " + calcularVolumenEsfera(radio2));
    }
}
