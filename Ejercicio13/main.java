package Ejercicio13;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class main {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        //Nos apoyamos en la clase DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(fecha.format(formatter));
    }
}
