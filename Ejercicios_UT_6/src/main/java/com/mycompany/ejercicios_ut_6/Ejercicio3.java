/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_ut_6;
/* Se importa el paquete "Scanner"/escáner. */
import java.util.Scanner;
/**
 *
 * @author RODRISTARK17
 */
/* Se crea la clase. */
public class Ejercicio3{
    /* Se crea el método privado con su respectiva variable no numérica y almacenable. */
    private String texto;
    /* Se genera el método "Ejercicio3" y el constructor para la variable de dicho método. */
    public Ejercicio3(String texto){
        this.texto = texto;
    }
    /* Se crea el método "Espacios" donde se encontrará la parte funcional del programa. */
    public int Espacios(){
        /* Nos aseguramos de no contabilizar espacios que no estén entre las palabras y/o letras. */
        texto = texto.trim();
        /* Nos aseguramos de no contabilizar más de un espacio entre las palabras y/o letras. */
        texto = texto.replaceAll("\\s+", " ");
        /* Se crea una variable numérica contabilizadora. */
        int contador = 0;
        /* Se crea un bucle de tipo "for" con el que identificar, recorrer y almacenar la cantidad de espacio vacíos/en blanco dentro de la variable, del texto u oración insertado. */
        for (int i = 0; i < texto.length(); i++){
            if (Character.isSpaceChar(texto.charAt(i))){
                contador ++;
            }
        }
        /* Se devuelve el último valor obtenido para "contador" tras finalizar el recorrido del bucle "for". */
        return contador;
    }
    /* Se creal el método principal. */
    public static void main(String[] args){
        /* Se crea el escáner para interactuar con el usuario. */
        Scanner usuario = new Scanner(System.in);
        System.out.println("Bienvenido al programa 'Contador de espacios en blanco/vacios', por favor ingrese su nombre: ");
        String nombre = usuario.nextLine();
        System.out.println("\nBienvenido al programa " + nombre + ", ahora introduzca la frase u oracion de la que quiera obtener el  numero de espacios en blanco o vacios: ");
        String texto = usuario.nextLine();
        /* Se instancia el método "Ejercicio3" y se genera el método "Espacios". */
        Ejercicio3 oracion = new Ejercicio3(texto);
        System.out.println("\nEl texto introducido en el sistema tiene " + oracion.Espacios() + " espacios en blanco/vacios.");
        /* Se cierra el escáner. */
        usuario.close();
    }
}