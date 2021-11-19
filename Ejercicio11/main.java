package Ejercicio11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un texto cualquiera: ");
        String text = scan.nextLine();
        String [] array = text.split("");
        int vocales = 0;
        for(String value: array){
            switch(value){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vocales++;
            }
        }
        System.out.println("La frase tiene una longitud de "+text.length()+" y tiene "+ vocales+ " vocales.");

    }
}
