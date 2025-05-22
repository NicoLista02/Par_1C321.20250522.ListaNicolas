/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

import java.util.Comparator;

/**
 *
 * @author PC
 */
public class ComparadorCapacidad implements Comparator<Nave> {

    @Override
    public int compare(Nave nave1, Nave nave2) {
        return Integer.compare(nave1.getCapacidad_de_tripulacion(), nave2.getCapacidad_de_tripulacion());
    }
}
