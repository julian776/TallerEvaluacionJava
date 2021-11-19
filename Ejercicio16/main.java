package Ejercicio16;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.print("Ingrese el sexo(H M): ");
        String sexo = scan.nextLine();
        System.out.print("Ingrese el peso en kg: ");
        int peso = scan.nextInt();
        System.out.print("Ingrese la altura en metros: ");
        Float altura = scan.nextFloat();

        //Creacion de los objetos
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona1 = new Persona(nombre, edad, sexo);
        Persona persona2 = new Persona();

        //Uso de los setters para persona2
        persona2.setNombre("Pablo");
        persona2.setEdad(21);
        persona2.setSexo("H");
        persona2.setPeso(62);
        persona2.setAltura((float) 1.8);

        //Revision de los pesos
        persona.calcularIMC();
        persona1.calcularIMC();
        persona2.calcularIMC();

        //Comprobar si es mayor de edad
        persona.esMayorDeEdad();
        persona1.esMayorDeEdad();
        persona2.esMayorDeEdad();

        //Mostrar todos los objetos
        System.out.println(persona);
        System.out.println(persona1);
        System.out.println(persona2);
    }
}
