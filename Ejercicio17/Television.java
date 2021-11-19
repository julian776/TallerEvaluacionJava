package Ejercicio17;

public class Television extends Electrodomestico {
    protected double resolucion = 20;
    protected boolean TDT = false;

    //Constructores
    public Television() {

    }

    public Television(int precio, double peso) {
        super(precio, peso);
    }

    public Television(int precio, double peso, String color, String consumo_energetico, double resolucion, boolean TDT) {
        super(precio, peso, color, consumo_energetico);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    //Getters
    public double getResolucion() {
        return this.resolucion;
    }

    public boolean getTDT() {
        return this.TDT;
    }

    //PrecioFinal
    public void precioFinal() {
        super.precioFinal();
        double acumulado = 0;
        if (this.resolucion >= 40) {
            acumulado += (this.precio * (0.3));
        }
        if(this.TDT){
            acumulado += 50;
        }
        this.precio += acumulado;
    }

}
