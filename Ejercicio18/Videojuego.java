package Ejercicio18;

public class Videojuego implements Entregable{
    protected String titulo = "";
    protected double horasEstimadas = 10;
    protected boolean entregado = false;
    protected String genero = "";
    protected String compania = "";

    //Constructores
    public Videojuego() {

    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, double horasEstimadas, String genero, String comapnia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = comapnia;
    }

    //Setters
    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Getters
    public double getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getCompania() {
        return this.compania;
    }

    public String getGenero(){
        return this.genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    //Metodos de la interfaz
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object o) {
        double comparar = 0;
        if(o instanceof Videojuego){
            comparar = ((Videojuego) o).getHorasEstimadas();
        }
        else if(o instanceof Serie){
            comparar = ((Serie) o).getTemporadas();
        }
        return (int) (this.horasEstimadas - comparar);
    }
}
