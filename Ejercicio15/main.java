package Ejercicio15;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("****** GESTION CINEMATOGRAFICA ********\n" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6- VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR: ");
            int answer = scan.nextInt();
            if(answer == 8){
                break;
            }
            else if(!(answer>=1 && answer<=7)){
                System.out.println("\nOpcion Incorrecta");
            }
        }
    }
}
