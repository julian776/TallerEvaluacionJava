package Ejercicio18;

public class Serie implements Entregable{
    protected String titulo = "";
    protected int temporadas = 3;
    protected boolean entregado = false;
    protected String genero = "";
    protected String creador = "";

    //Constructores
    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String creador, int temporadas, String genero) {
        this.titulo = titulo;
        this.creador = creador;
        this.temporadas = temporadas;
        this.genero = genero;
    }

    //Getters
    public String getTitulo(){
        return this.titulo;
    }

    public String getCreador(){
        return this.creador;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getTemporadas(){
        return this.temporadas;
    }

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setCreador(String creador){
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        double comparar=0;
        if(o instanceof Videojuego) {
            comparar = ((Videojuego) o).getHorasEstimadas();
        }
        else if(o instanceof Serie){
            comparar = ((Serie) o).getTemporadas();
        }
        return (int) (this.temporadas - comparar);

    }
}
