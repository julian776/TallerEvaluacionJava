package Ejercicio12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        System.out.print("Ingrese una segunda palabra: ");
        String palabra1 = scan.nextLine();
        String diff = "";
        if(palabra.compareTo(palabra1) == 0){
            System.out.println("Las palabras son iguales");
        }
        else{
            try{
                String [] splitPalabra = palabra.split("");
                String [] splitPalabra1 = palabra1.split("");
                int index = 0;
                for(String caracter: splitPalabra){
                    if(caracter.compareTo(splitPalabra1[index]) == 0){
                        diff+=caracter;
                    }
                    else{
                        diff+="#";
                    }
                    index++;
                }
            }catch(Exception e){
                if(palabra.length()>palabra1.length()){
                    String completar = "";
                    for(int i=1; i<=(palabra.length()-palabra1.length());i++){
                        completar+="#";
                    }
                    diff += completar;
                }
                else{
                    String completar = "";
                    for(int i=1; i<=(palabra1.length()-palabra.length());i++){
                        completar+="#";
                    }
                    diff += completar;
                }
            }
            System.out.println("Las diferencias encontradas son: "+diff);
        }
    }
}
