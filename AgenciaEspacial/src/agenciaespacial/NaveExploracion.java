/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;
import agenciaespacial.Nave;

/**
 *
 * @author PC
 */
public class NaveExploracion extends Nave{
    private static String tipo_mision;

    public NaveExploracion(String nombre, int capacidad_de_carga, int ano_de_lanzamiento, String tipoMision) {
        super(nombre, capacidad_de_carga, ano_de_lanzamiento);
        this.tipo_mision = tipoMision;
    }

    public String getTipo_mision() {
        return tipo_mision;
    }
    
    @Override
    public void mostrarNave(){
        System.out.println("Nave de exploracion: " + super.toString() + " - tipo de mision: " + this.getTipo_mision());
    }
}
