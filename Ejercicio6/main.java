package Ejercicio6;

public class main {
    public static void main(String[] args) {
        //Pares
        System.out.println("Pares");
        for(int i=1; i<=100;i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
        //Impares
        System.out.println("Impares");
        for(int i=0; i<=100;i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
