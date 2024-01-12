/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestio_tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestio_Tareas {

    public static void main(String[] args) {
       ArrayList<String> listaTareas = new ArrayList<>();
       ArrayList<String> listaCompletada = new ArrayList<>();
       String Tarea;
       Scanner scanner = new Scanner(System.in);
       
       while (true) {
       
        System.out.println("\nMenú:");

            System.out.println("1. Agregar Tarea");

            System.out.println("2. Marcar Tarea completadas");
            
            System.out.println("3. Listar Tareas pendientes");
            
            System.out.println("4. Borrar Tareas completadas");
            
            System.out.println("5. Salir");
            
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();

            scanner.nextLine(); // Limpiar el buffer del scanner
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la Tarea: ");

                    Tarea = scanner.nextLine();
                    
                     if (!listaTareas.contains(Tarea)) {

                        listaTareas.add(Tarea);


                        System.out.println("Tarea agregada correctamente.");

                    } else {

                        System.out.println("La tarea ya existe en la lista.");

                    }

                break;
                
                case 2:
                    System.out.print("Ingrese el nombre de la Tarea a marcar como completada: ");
                    Tarea = scanner.nextLine();
                    
                    if (listaTareas.contains(Tarea)) {
                        listaTareas.remove(Tarea);
                        listaCompletada.add(Tarea);
                    
                        System.out.println("Tarea marcada como completada.");
                    } 
                    
                    else {
                        System.out.println("La tarea no existe en la lista de pendientes.");
                    }
                
                break;
                
                case 3:
                    System.out.println("Lista de Tareas Pendientes:");
                    
                    for (String tarea : listaTareas) {
                        System.out.println(tarea);
                    }

                    
                break;
                
                case 4:
                    
                    System.out.print("Ingrese el nombre de la Tarea completada a eliminar: ");
                    Tarea = scanner.nextLine();
                    
                        if (listaCompletada.contains(Tarea)) {
                            
                            listaCompletada.remove(Tarea);
                            
                            System.out.println("Tarea eliminada de la lista completada.");
                        } 
                        
                        else {
                            System.out.println("La tarea no existe en la lista completada.");
                        }
                break;
                
                case 5:
                    System.out.println("Saliendo del programa.");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("Opción inválida. Intente de nuevo.");
            }
    
        } 
    }
}
