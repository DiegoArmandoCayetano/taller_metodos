/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_6 {
    public static double[] convertirDesdeSegundos(double segundos) {
        double[] resultado = new double[3]; // Índice 0: días, Índice 1: horas, Índice 2: minutos
        resultado[0] = segundos / (24 * 60 * 60); // Segundos en un día
        resultado[1] = (segundos % (24 * 60 * 60)) / (60 * 60); // Resto de segundos convertidos a horas
        resultado[2] = ((segundos % (24 * 60 * 60)) % (60 * 60)) / 60; // Resto de segundos convertidos a minutos
        return resultado;
    }

    public static void main(String[] args) {
        // Casos de prueba
        double segundos1 = 172800; // 2 días
        double[] resultado1 = convertirDesdeSegundos(segundos1);
        System.out.println(segundos1 + " segundos equivalen a " + resultado1[0] + " días, " + resultado1[1] + " horas, " + resultado1[2] + " minutos");

        double segundos2 = 3600; // 1 hora
        double[] resultado2 = convertirDesdeSegundos(segundos2);
        System.out.println(segundos2 + " segundos equivalen a " + resultado2[0] + " días, " + resultado2[1] + " horas, " + resultado2[2] + " minutos");
    }
}
