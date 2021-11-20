package org.josue;

import java.io.*;

public class Cliente {
    private static BufferedReader entrada = new BufferedReader(new
            InputStreamReader(System.in));
    private static Servidor_Proxy Servidor_Proxy = new Servidor_Proxy(new Servidor_Ficheros("MiServidor"));
    public static void main(String args[]) {
        String operacion, nombre, id;
        while (true) {
            try {
                do {
                    System.out.println("\n\n--- OPERACIONES ---");
                    System.out.println("1- Subir fichero ");
                    System.out.println("2- Bajar fichero ");
                    System.out.println("3- Listado de ficheros ");
                    System.out.println("4- Salir ");
                    System.out.print("Seleccione la operación: ");
                    operacion = entrada.readLine();
                } while (!operacion.equals("1") && !operacion.equals("2")
                        && !operacion.equals("3") && !operacion.equals("4"));
                // subir
                if (operacion.equals("1")) {
                    System.out.println("\n -- Subir fichero -- ");
                    System.out.print("Introduzca nombre fichero: ");
                    nombre = entrada.readLine();
                    System.out.println(Servidor_Proxy.subir(nombre));
                } // bajar
                else if (operacion.equals("2")) {
                    System.out.println("\n -- Bajar fichero -- ");
                    System.out.println(Servidor_Proxy.listado());
                    System.out.print("Introduzca id del fichero: ");
                    id = entrada.readLine();
                    Fichero fichero = Servidor_Proxy.bajar(id);
                    System.out.println(fichero.toString());
                } // listado
                else if (operacion.equals("3")) {
                    System.out.println("\n -- Listado ficheros -- ");
                    System.out.println(Servidor_Proxy.listado());
                } // salir
                else if (operacion.equals("4")) {
                    System.exit(0);
                }
            } catch (NumberFormatException NFE) {
                System.out.println("\nError de formato numérico: " + NFE.toString());
            } catch (IOException IOE) {
                System.out.println("\nError de entrada/salida: " + IOE.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
