/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:  ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de notas a registrar");
        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        
        Estudiante estudiante = new Estudiante(nombre, notas);

        double promedio = CalculoAcademico.CalculoPromedio(estudiante.Notas);
        boolean aprobado = CalculoAcademico.Aprueba(promedio);

        // --- SECCIÓN MODIFICADA PARA OCP ---
        System.out.println("Seleccione una opción de ajuste:");
        System.out.println("1. Aplicar Punto Extra");
        System.out.println("2. Aplicar Penalización");
        System.out.println("3. Sin cambios");
        int op = sc.nextInt();

        ReglaPromedio miRegla = null;

        if (op == 1) {
            miRegla = new ReglaPuntoExtra(); 
        } else if (op == 2) {
            miRegla = new ReglaPenalizacion(); // Nueva regla sin tocar CalculoAcademico
        }

        if (miRegla != null) {
            // Aplicamos el ajuste de forma genérica
            double promedioAjustado = CalculoAcademico.AplicarAjuste(promedio, miRegla);
            boolean aprobadoAjustado = CalculoAcademico.Aprueba(promedioAjustado);
            Reporte.Mostrar(estudiante, promedioAjustado, aprobadoAjustado);
        } else {
            // Si eligió 3 o cualquier otra cosa, se muestra el original
            Reporte.Mostrar(estudiante, promedio, aprobado);
        }
        
        sc.close();
    }
}