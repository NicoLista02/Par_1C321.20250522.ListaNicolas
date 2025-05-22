/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaespacial;

/**
 *
 * @author PC
 */
public abstract class Nave implements Comparable<Nave>{
    private String nombre;
    private int capacidad_de_tripulacion;
    private int ano_de_lanzamiento;

    public Nave(String nombre, int capacidad_de_tripulacion, int ano_de_lanzamiento) {
        this.nombre = nombre;
        this.capacidad_de_tripulacion = capacidad_de_tripulacion;
        this.ano_de_lanzamiento = ano_de_lanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad_de_tripulacion() {
        return capacidad_de_tripulacion;
    }

    public int getAno_de_lanzamiento() {
        return ano_de_lanzamiento;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidad_de_tripulacion=" + capacidad_de_tripulacion + ", ano_de_lanzamiento=" + ano_de_lanzamiento + '}';
    }
    
    public abstract void mostrarNave();

    @Override
    public int compareTo(Nave otraNave){
        return this.nombre.compareTo(otraNave.getNombre());
    }
    
    
}
