package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Realizar un programa para ingresar desde el teclado un conjunto de números e informar el último elemento ingresado en una posición par.
    Finalizar la lectura de datos con el valor -1.
    Ejemplos:
    Si la secuencia es 3 7 4 5 6 7 9 -1 el valor a informar es 7.
    Si la secuencia es 3 7 4 5 -1 el valor a informar es 5.
     */
    public static void main(String[] args) {

        int numeroAgregado;
        Scanner reader = new Scanner(System.in);
        numeroAgregado = reader.nextInt();

        ArrayList e = new ArrayList();

        while (numeroAgregado != -1){
            e.add(numeroAgregado);
            numeroAgregado = reader.nextInt();
        }
        if (e.size() % 2 == 0){
            System.out.println(e.get(e.size()-1));
        } else {
            System.out.println(e.get(e.size()-2));
        }
    }
}
