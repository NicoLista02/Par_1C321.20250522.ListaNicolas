/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

/**
 *
 * @author PC
 */
public class NaveCrucero extends Nave{
    private static int cantidad_pasajeros;

    public NaveCrucero(String nombre, int capacidad_de_carga, int ano_de_lanzamiento, int cantidadPasajeros) {
        super(nombre, capacidad_de_carga, ano_de_lanzamiento);
        this.cantidad_pasajeros = cantidadPasajeros;
    }

    public static int getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }
    
    @Override
    public void mostrarNave() {
        System.out.println("Nave crucero: " + super.toString() + " - cantidad de pasajeros: " + this.getCantidad_pasajeros());
    }

}
