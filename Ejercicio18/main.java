package Ejercicio18;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Videojuego listaJuegos[] = new Videojuego[5];
        Serie listaSeries[] = new Serie[5];

        //Agregar y crear los objetos
        Videojuego pes = new Videojuego("pes", 16, "futbol", "Konami");
        Videojuego FIFA = new Videojuego("FIFA", 34, "futbol", "EA");
        Videojuego MarioKart = new Videojuego("MarioKart", 20);
        Videojuego GTA = new Videojuego("GTA", 62, "SandBox", "RockStar");
        Videojuego juegoBasico = new Videojuego();
        listaJuegos[0] = pes;
        listaJuegos[1] = FIFA;
        listaJuegos[2] = MarioKart;
        listaJuegos[3] = GTA;
        listaJuegos[4] = juegoBasico;
        //Series
        Serie EraHielo = new Serie("Era del Hielo", "Antonio", 4, "familiar");
        Serie Terminator = new Serie("Terminator", "Juanita", 6, "familiar");
        Serie serieBasica = new Serie();
        Serie lordRings = new Serie("Lord of Rings", "Bob", 5, "Aventura");
        Serie KerGame = new Serie("KerGame", "Reckaafod");
        listaSeries[0] = EraHielo;
        listaSeries[1] = Terminator;
        listaSeries[2] = serieBasica;
        listaSeries[3] = lordRings;
        listaSeries[4] = KerGame;
        //Entregar algunos
        lordRings.entregar();
        EraHielo.entregar();
        pes.entregar();
        GTA.entregar();
        juegoBasico.entregar();
        Terminator.entregar();
        //Contar los entregados y devolverlos
        int count = 0;
        for (Videojuego obj : listaJuegos) {
            if (obj.isEntregado()) {
                count++;
                obj.devolver();
            }
        }
        System.out.println("Los videojuegos entregados son: " + count);
        count = 0;
        for(Serie obj : listaSeries){
            if(obj.isEntregado()){
                count++;
                obj.devolver();
            }
        }
        System.out.println("Los series entregadas son: " + count);

        //Encontrar la serie con mas horas y el videojuego con mas horas
        Videojuego maxValue = new Videojuego();
        maxValue.setHorasEstimadas(0);
        for (Videojuego obj : listaJuegos){
            if(obj.compareTo(maxValue)>0){
                maxValue = obj;
            }
        }
        System.out.println("EL videojuego con mas horas estimadas es: "+maxValue);
        //Serie
        Serie maxTemporadas = new Serie();
        maxTemporadas.setTemporadas(0);
        for (Serie obj : listaSeries){
            if(obj.compareTo(maxTemporadas)>0){
                maxTemporadas = obj;
            }
        }
        System.out.println("La serie con mas temporadas es: "+maxTemporadas);
    }
}
