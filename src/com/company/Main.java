package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá un numero entre 0 y 9999 y mostrara las cifras al revés.");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca un número dentro del rango");
        //Guardamos en la variable el primer valor
        int num1 = sc.nextInt();

        //Se hacen las comparaciones y operaciones para mostrar el numero de cifras.
        if (num1>=0&&num1<=9999) {
            String num = String.valueOf(num1);
            String reves ="";

            char[] numReves = num.toCharArray();

            for (int i=numReves.length-1; i>-1;i--) {
                reves+=numReves[i]+"";
            }
            System.out.println("El numero introducido con las cifras al reves es: "+reves);

        } else {
            System.out.println("El número introducido esta fura del rango 0 y 9999");
        }



    }

}