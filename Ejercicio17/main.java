package Ejercicio17;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Electrodomestico lista[] = new Electrodomestico[10];
        //Television
        Television tv = new Television(140, 5, "blanco", "A", 55, true);
        Television tv1 = new Television(100, 9, "blanco", "F", 62, false);
        Television tv2 = new Television(78, 8, "blanco", "B", 25, false);
        Television tv3 = new Television(150, 12, "blanco", "F", 44, false);
        Television tv4 = new Television(420, 9.4, "blanco", "A", 32, true);
        //Lavadoras
        Lavadora lavadora = new Lavadora(200, 30, "blanco", "E", 35);
        Lavadora lavadora1 = new Lavadora(150, 24, "blanco", "B", 32);
        Lavadora lavadora2 = new Lavadora(120, 14, "blanco", "F", 16);
        Lavadora lavadora3 = new Lavadora(220, 36, "blanco", "F", 18);
        Lavadora lavadora4 = new Lavadora(140, 24, "blanco", "A", 22);
        //Add objetos
        lista[0] = (tv);
        lista[1] = tv1;
        lista[2] = (tv2);
        lista[3] = (tv3);
        lista[4] = tv4;
        lista[5] = (lavadora);
        lista[6] = (lavadora1);
        lista[7] = (lavadora2);
        lista[8] = (lavadora3);
        lista[9] = (lavadora4);

        int count = 0;
        double totalTvs = 0;
        double totalLavadoras = 0;
        double lookprice = 0;
        while (count < 10) {
            (lista[count]).precioFinal();
            if (lista[count] instanceof Television) {
                lookprice = lista[count].getPrecio();
                totalTvs += lookprice;
                System.out.println("Televisor con precio: " + lookprice);
            } else if (lista[count] instanceof Lavadora) {
                lookprice = lista[count].getPrecio();
                totalLavadoras += lookprice;
                System.out.println("Lavadora con precio: " + lookprice);
            }
            count++;
        }
        System.out.println("El total de los televisores es: " + totalTvs);
        System.out.println("El total de las lavadoras es: " + totalLavadoras);
        System.out.println("El total de los electrodomesticos es: " + (totalTvs + totalLavadoras));
    }
}
