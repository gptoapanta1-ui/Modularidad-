/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author user
 */
public class Reporte {
    public static void Mostrar(Estudiante e, double promedio, boolean aprobado){
        System.out.println("Estudiante: " + e.Nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (aprobado ? "Aprobado": "Reprobado"));
        }
    
}
