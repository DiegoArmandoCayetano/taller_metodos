/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_5 {
  public static int convertirADiasHorasMinutosASegundos(int dias, int horas, int minutos) {
        return dias * 24 * 60 * 60 + horas * 60 * 60 + minutos * 60;
    }

    public static void main(String[] args) {
        // Casos de prueba
        int dias1 = 2;
        int horas1 = 5;
        int minutos1 = 30;
        System.out.println("Total de segundos (Caso 1): " + convertirADiasHorasMinutosASegundos(dias1, horas1, minutos1));

        int dias2 = 1;
        int horas2 = 0;
        int minutos2 = 0;
        System.out.println("Total de segundos (Caso 2): " + convertirADiasHorasMinutosASegundos(dias2, horas2, minutos2));
    }
}
