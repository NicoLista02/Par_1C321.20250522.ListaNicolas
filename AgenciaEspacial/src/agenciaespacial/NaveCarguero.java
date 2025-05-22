/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

/**
 *
 * @author PC
 */
public class NaveCarguero extends Nave {

    private static int capacidad_carga;

    public NaveCarguero(String nombre, int capacidad_de_tripulacion, int ano_de_lanzamiento, int capacidadCarga) {
        super(nombre, capacidad_de_tripulacion, ano_de_lanzamiento);
        this.capacidad_carga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidad_carga;
    }

    @Override
    public void mostrarNave() {
        System.out.println("Nave carguero: " + super.toString() + " - capacidad de carga: " + this.getCapacidadCarga());
    }

}
