/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author user
 */
public class CalculoAcademico {
    public static double CalculoPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) suma += nota;
        return suma / notas.length;
    }

    public static boolean Aprueba(double promedio) {
        return promedio >= 14;
    }

 
    public static double AplicarAjuste(double promedio, ReglaPromedio regla) {
        return regla.aplicar(promedio);
    }
}
