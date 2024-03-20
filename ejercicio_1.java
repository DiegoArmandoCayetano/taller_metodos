/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_metodos;

/**
 *
 * @author Armando Bautista
 */
public class ejercicio_1 {
   
   public class CalculadoraDescuento {
    public static double calcularPrecioConDescuento(double precio, double descuento) {
        return precio - (precio * descuento / 100);
    }

    public static void main(String[] args) {
        // Casos de prueba
        double precio1 = 300;
        double descuento1 = 20;
        double precioFinal1 = calcularPrecioConDescuento(precio1, descuento1);
        System.out.println("Precio final con descuento (Caso 1): " + precioFinal1);

        double precio2 = 200;
        double descuento2 = 15;
        double precioFinal2 = calcularPrecioConDescuento(precio2, descuento2);
        System.out.println("Precio final con descuento (Caso 2): " + precioFinal2);
    }
}


}
