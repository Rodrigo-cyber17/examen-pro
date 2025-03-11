/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicios_ut_6;
/* Se importa el paquete "Arrays"/conjuntos o matrices. */
import java.util.Arrays;
/* Se importa el paquete "Scanner"/escáner. */
import java.util.Scanner;
/* Se importa el paquete "JOptionPane"/panel de opciones. */
import javax.swing.JOptionPane;
/**
 *
 * @author RODRISTARK17
 */
/* Se crea la clase. */
public class Ejercicio1{
    /* Se crea un método privado con una variable numérica almacenable. */
    private int numero;
    /* Se crea el método "Ejercicio1" y el constructor para la variable de dicho método. */
    public Ejercicio1(int numero){
        this.numero = numero;
    }
    /* Se crea el método "Generar Numeros" donde se gerearán los 100 números de forma random*/
    public void GenerarNumeros(){
    /* Se crea el array con el que recorrer 100 posiciones, una para cada numero creado. */
    int [] array = new int [100];
    /* Se crea un bucle de tipo "for" con el que crear los numeros de forma aleatoria y del cero al 100, uno por pición leída. */
    for (int i = 0; i < array.length; i++){
        array[i] = (int) (Math.random() * 101);
    }
    System.out.println("Array generado: " + Arrays.toString(array));
    /* Se crea el bucle de tipo "switch" donde interactuar con el array. */
    switch (numero){
        /* Caso para obtener el número más grande. */
        case 1 ->{
            int maximo = array [0];
            for (int i : array){
                if (i > maximo){
                    maximo = i;
                }
            }
            System.out.println("El numero mas grande generado ha sido el " + maximo);
        }
        /* Caso para obtener el número más pequeño. */
        case 2 ->{
            int minimo = array [0];
            for (int i : array){
                if (i < minimo){
                    minimo = i;
                }
            }
            System.out.println("El numero mas pequeño generado ha sido el " + minimo);
        }
        /* Caso para obtener la suma de todos los números. */
        case 3 ->{
            int suma = 0;
            for (int i : array){
                suma += i;
            }
            System.out.println("La suma total de entre los numeros generados es de " + suma);
        }
        /* Caso para obtener la media sobre la suma del cómputo de todos los números. */
        case 4 ->{
            int suma = 0;
            for (int i : array){
                suma += i;
            }
            double media = suma /array.length;
            System.out.println("La media de la suma sobre el total de entre los número generados es de " + media);
        }
        /* Caso para sustituir un numero por otro. */
        case 5 ->{
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduzca la posición que desee cambiar dentro del array: "));
            if (posicion >= 0 || posicion <= 99){
                int cambio = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduzca la posición que desee cambiar dentro del array (Recuerde que la contabilización en las posiciones dentro de un array empieza en '0'): "));
                array[posicion] = cambio;
                System.out.println("\nEl cambio realizado ha sido en la posicion " + posicion + " por el nuevo numero (" + cambio + ").");
                System.out.println("\nArray despues del cambio: " + Arrays.toString(array));
            } else{
                System.err.println("\nPosicion introducida fuera de alcance/rango.");
                break;
            }
        }
        /* Caso para cubrir situaciones que no estén mencionadas en los demás "case". */
        default ->
        System.err.println("El numero introducido no se encuentra en nuestro sistema (Recuerde escoger entre el 1 y el 5, ambos incluidos).");
        }
    }
    /* Se crea el método principal, donde llamaremos al método "GenerarNumeros"*/
    public static void main(String[] args) {
        /* Se crea el escáner para interactuar con el usuario. */
        Scanner usuario = new Scanner(System.in);
        System.out.println("Bienvenido al programa 'Operador de numeros aleatorios', por favor introduzca su nombre: ");
        String nombre = usuario.nextLine();
        System.out.println("\nBienvenido al programa " + nombre + ", Por favor, introduzca que accion desea realizar sobre el array generado: \n    1. (Conocer el numero mas grande) \n    2. (Conocer el numero mas pequeño) \n    3. (Obtener la suma todos los numeros) \n    4. (Obtener la media sobre el computo de la suma) \n    5. (Cambiar/Sustituir un parametro o numero)");
        int numero = usuario.nextInt();
        /* Se instancia el método "Ejercicio1" y se genera el método "GenerarNumeros". */
        Ejercicio1 ejecutar = new Ejercicio1(numero);
        ejecutar.GenerarNumeros();
        /* Se cierra el escáner. */
        usuario.close();
    }
}