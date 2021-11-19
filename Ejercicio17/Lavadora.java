package Ejercicio17;

public class Lavadora extends Electrodomestico {
    //Atributos Lavadora
    private Double carga = 5.0;

    //constructores
    public Lavadora(){

    }

    public Lavadora(int precio, double peso){
        super(precio, peso);
    }

    public Lavadora(int precio, double peso, String color, String consumo_energetico, double carga){
        super(precio, peso, color, consumo_energetico);
        this.carga = carga;
    }

    //getter carga
    public Double getCarga(){
        return this.carga;
    }


    public void precioFinal(){
        super.precioFinal();
        double acumulado = 0;
        if(this.carga>=30){
            acumulado += 50;
        }
        this.precio += acumulado;
    }

}
