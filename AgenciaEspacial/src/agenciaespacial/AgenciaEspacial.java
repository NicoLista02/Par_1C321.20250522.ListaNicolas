/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenciaespacial;

import java.util.*;
import agenciaespacial.Nave;
import agenciaespacial.NaveCarguero;
import agenciaespacial.NaveCrucero;
import agenciaespacial.NaveExploracion;
import agenciaespacial.ComparadorAnio;
import agenciaespacial.ComparadorCapacidad;

/**
 *
 * @author PC
 */
public class AgenciaEspacial {
    public static ArrayList<Nave> flota = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarNave(scanner);
                    break;
                case 2:
                    mostrarNaves();
                    break;
                case 3:
                    iniciarExploracion(scanner, flota);
                    break;
                case 4:
                    Collections.sort(flota);
                    mostrarNaves();
                    break;
                case 5:
                    Collections.sort(flota, new ComparadorAnio());
                    mostrarNaves();
                    break;
                case 6:
                    Collections.sort(flota, new ComparadorCapacidad());
                    mostrarNaves();
                    break;
                case 7:
                    System.out.println("Saliendo del programa ...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente");
            }
        } while (opcion != 7);
        
        scanner.close();
    }
    
    public static void mostrarMenu(){
        System.out.println("\n--------MENU--------");
        System.out.println("1. Agregar Nave");
        System.out.println("2. Mostrar todas las naves");
        System.out.println("3. Iniciar exploracion");
        System.out.println("4. Mostrar naves ordenadas por nombre");
        System.out.println("5. Mostrar naves ordenadas por ano de lanzamiento");
        System.out.println("6. Mostrar naves ordenadas por capacidad de tribulacion");
        System.out.println("7. Salir");
    }
    
    public static void agregarNave(Scanner scanner){
        System.out.println("\nSeleccione ona opcion:");
        System.out.println("1. Nave de exploracion");
        System.out.println("2. Nave carguero");
        System.out.println("3. Nave crucero espacial");
        
        String opcion = scanner.nextLine();
        int validOpcion = Integer.parseInt(opcion);
        
        String nombre;
        int capacidad;
        int anoLanzamiento;
        String decision;
        String tipoElegido;
        
        switch (validOpcion) {
            case 1:
                System.out.println("Ingresar datos de la nueva nave de exploracion");
                System.out.println("Nombre:");
                nombre = scanner.nextLine();
                System.out.println("Capacidad de tripulacion:");
                capacidad = scanner.nextInt();
                System.out.println("ano de lanzamiento");
                anoLanzamiento = scanner.nextInt();
                System.out.println("Elige el tipo de mision que realizara:");
                System.out.println("1. Cartografia");
                System.out.println("2. Investigacion");
                System.out.println("3. Contacto");
                int tipo = scanner.nextInt();
                if (tipo == 1){
                    tipoElegido = "Cartografia";
                } else if (tipo == 2){
                    tipoElegido = "Investigacion";
                } else if (tipo == 3){
                    tipoElegido = "Contacto";
                } else {
                    tipoElegido = "no definido";
                }
                
                NaveExploracion nueva_nave_exploracion = new NaveExploracion(nombre, capacidad, anoLanzamiento, tipoElegido);
                
                if(existeNave(flota, nombre, anoLanzamiento)){
                    System.out.println("La nave ya existe, desea agregarla igualmente [si / no]:");
                    decision = scanner.nextLine();
                    if (decision.equals("no")){
                        break;
                    }
                }
                flota.add(nueva_nave_exploracion);              
                break;
            case 2:
                System.out.println("Ingresar datos de la nueva nave carguero");
                System.out.println("Nombre:");
                nombre = scanner.nextLine();
                System.out.println("Capacidad de tripulacion:");
                capacidad = scanner.nextInt();
                System.out.println("ano de lanzamiento");
                anoLanzamiento = scanner.nextInt();
                System.out.println("Capacidad de carga:");
                int capacidadCarga = validarCapacidadCargaCarguero(scanner.nextInt());
                
                NaveCarguero nueva_nave_carguero = new NaveCarguero(nombre, capacidad, anoLanzamiento, capacidadCarga);
                
                if(existeNave(flota, nombre, anoLanzamiento)){
                    System.out.println("La nave ya existe, desea agregarla igualmente [si / no]:");
                    decision = scanner.nextLine();
                    if (decision.equals("no")){
                        break;
                    }
                }
                flota.add(nueva_nave_carguero);              
                break;
            case 3:
                System.out.println("Ingresar datos de la nueva nave crucero espacial");
                System.out.println("Nombre:");
                nombre = scanner.nextLine();
                System.out.println("Capacidad de tripulacion:");
                capacidad = scanner.nextInt();
                System.out.println("ano de lanzamiento");
                anoLanzamiento = scanner.nextInt();
                System.out.println("Capacidad de pasajeros:");
                int capacidadPasajeros = scanner.nextInt();
                
                NaveCrucero nueva_nave_crucero = new NaveCrucero(nombre, capacidad, anoLanzamiento, capacidadPasajeros);
                
                if(existeNave(flota, nombre, anoLanzamiento)){
                    System.out.println("La nave ya existe, desea agregarla igualmente [si / no]:");
                    decision = scanner.nextLine();
                    if (decision.equals("no")){
                        break;
                    }
                }
                flota.add(nueva_nave_crucero);    
                break;
            default:
                System.out.println("Opcion invalida. Intente nuevamente");
        }
    }
    
    public static boolean existeNave(ArrayList<Nave> flota, String nombre, int anoLanzamiento){
        for(Nave nave : flota){
            if(nave.getNombre().equals(nombre) && nave.getAno_de_lanzamiento() == anoLanzamiento){
                return true;
            }
        }
        return false;
    }
    
    public static void mostrarNaves(){
        if(flota.isEmpty()){
            System.out.println("No hay naves en la flota.");
        } else {
            System.out.println("\n---- Flota Espacial ----");
            for (Nave nave : flota){
                nave.mostrarNave();
                System.out.println("----------------------");
            }
        }
    }
    
    public static int validarCapacidadCargaCarguero(int capacidad){
        if(capacidad < 100){
            return 100;
        } else if (capacidad > 500) {
            return 500;
        }
        return capacidad;
    }
    
    public static void iniciarExploracion(Scanner scanner, ArrayList<Nave> flota){
        String input;
        System.out.println("\nIndique el nombre de la nave que quiere usar:");
        input = scanner.nextLine();
        
        for (Nave nave : flota){
            if(nave.getNombre().equals(input)){
                if(nave instanceof NaveCarguero || nave instanceof NaveExploracion){
                    System.out.println("Iniciando exploracion con nave:");
                    nave.mostrarNave();
                } else {
                    System.out.println("Las naves crucero no pueden usarse para exploracion");
                }
            } else {
                System.out.println("Esta nave no existe");
            }
        }
    }
}
