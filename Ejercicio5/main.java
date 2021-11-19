package Ejercicio5;

public class main {
    public static void main(String[] args) {
        //numeros pares
        int count = 1;
        System.out.println("Pares");
        while (count<=100){
            if (count%2 == 0){
                System.out.println(count);
            }
            count++;
        }
        //Impares
        count = 0;
        System.out.println("Impares");
        while (count<=100){
            if (count%2 != 0){
                System.out.println(count);
            }
            count++;
        }
    }
}
