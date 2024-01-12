/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_list_ejemplo;

import java.util.ArrayList;
import java.util.Scanner;


public class Array_list_ejemplo {

     public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>();

        ArrayList<String> listaNumeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("\nMenú:");

            System.out.println("1. Agregar contacto");

            System.out.println("2. Buscar contacto");

            System.out.println("3. Mostrar todos los contactos");

            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");



            int opcion = scanner.nextInt();

            scanner.nextLine(); // Limpiar el buffer del scanner



            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el nombre del contacto: ");

                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el número de teléfono: ");

                    String numero = scanner.nextLine();



                    if (!listaNombres.contains(nombre)) {

                        listaNombres.add(nombre);

                        listaNumeros.add(numero);

                        System.out.println("Contacto agregado correctamente.");

                    } else {

                        System.out.println("El contacto ya existe en la lista.");

                    }

                    break;

                case 2:

                    System.out.print("Ingrese el nombre a buscar: ");

                    String nombreBusqueda = scanner.nextLine();



                    if (listaNombres.contains(nombreBusqueda)) {

                        int indice = listaNombres.indexOf(nombreBusqueda);

                        String numeroEncontrado = listaNumeros.get(indice);

                        System.out.println("Número de teléfono: " + numeroEncontrado);

                    } else {

                        System.out.println("Contacto no encontrado.");

                    }

                    break;

                case 3:

                    System.out.println("Lista de contactos:");

                    for (int i = 0; i < listaNombres.size(); i++) {

                        System.out.println("Nombre: " + listaNombres.get(i) + " - Número: " + listaNumeros.get(i));

                    }

                    break;

                case 4:

                    System.out.println("Saliendo del programa.");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("Opción inválida. Intente de nuevo.");

            }

        }

    }
}
