/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author user
 */
public class ReglaPuntoExtra implements ReglaPromedio {
    @Override
    public double aplicar(double promedio) {
        return promedio + 1;
    }
}
