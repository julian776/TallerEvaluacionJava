package Ejercicio17;

public class Electrodomestico {
    protected int precio = 100;
    protected String color = "blanco";
    protected String consumo_energetico = "F";
    protected double peso = 5.0;

    //constructores
    public Electrodomestico() {
        //default
    }

    public Electrodomestico(int precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precio, double peso, String color, String consumo_energetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        comprobarConsumoEnergetico(consumo_energetico);
    }

    //Getters
    public int getPrecio() {
        return this.precio;
    }

    public double getPeso() {
        return this.peso;
    }

    public String getColor() {
        return this.color;
    }

    public String getConsumo_energetico() {
        return this.consumo_energetico;
    }

    private void comprobarConsumoEnergetico(String letra) {
        switch (letra) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                assert true;
                break;
            default:
                this.consumo_energetico = "F";
        }
    }

    public void precioFinal() {
        double acumulado = 0.0;
        switch (this.consumo_energetico) {
            case "A":
                acumulado += 100;
                break;
            case "B":
                acumulado += 80;
                break;
            case "C":
                acumulado += 60;
                break;
            case "D":
                acumulado += 50;
                break;
            case "E":
                acumulado += 30;
                break;
            case "F":
                acumulado += 10;
                break;
        }
        if (this.peso >= 0 && this.peso <= 19) {
            acumulado += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            acumulado += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            acumulado += 80;
        } else if (this.peso >= 80) {
            acumulado += 100;
        }
        this.precio += acumulado;
    }

}


