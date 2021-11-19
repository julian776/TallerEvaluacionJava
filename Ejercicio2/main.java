package Ejercicio2;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("--------------------");
        if(num1>num2){
            System.out.println(num1+" es mayor a "+num2);
        }
        else if (num1<num2){
            System.out.println(num2+" es mayor a "+num1);
        }
        else if (num1==num2){
            System.out.println("Ambos son iguales");
        }
    }
}
