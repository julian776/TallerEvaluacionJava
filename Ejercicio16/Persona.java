package Ejercicio16;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String sexo = "H";
    private int peso = 0;
    private float altura = 0;

    public Persona() {
        this.DNI = generarDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();
        comprobarSexo();
        /*Inicializo el sexo para poder usarlo en los otros metodos, aun asi decia que debia
        * ser constante*/
    }

    public Persona(String nombre, int edad, String sexo, int peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.DNI = generarDNI();
        comprobarSexo();
    }

    public int calcularIMC(){
        final int pesoIdeal = -1;
        final int bajoPeso = 0;
        final int sobrePeso = 1;

        double IMC = this.peso/(Math.pow(this.altura, 2));
        if(IMC<20){
            System.out.println(this.nombre+" esta en su peso ideal.");
            return pesoIdeal;
        }
        else if(IMC>=20 && IMC<=25){
            System.out.println(this.nombre+" bajo de peso");
            return bajoPeso;
        }
        else if(IMC>25){
            System.out.println(this.nombre+" esta en sobrepeso.");
            return sobrePeso;
        }
        return bajoPeso;
    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            System.out.println("Es mayor");
            return true;
        }
        else{
            System.out.println("No es mayor de edad");
            return false;
        }
    }

    public void comprobarSexo(){
        if((this.sexo.compareTo("H") != 0) && (this.sexo.compareTo("M") != 0)){
            this.sexo = "H";
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generarDNI(){
        String DNI= "";
        String randNum;
        for(int i=0; i<=8;i++){
            randNum = String.valueOf(Math.round(Math.random()*9));
            DNI += randNum;
        }
        int selector = Integer.parseInt(DNI)%23;
        DNI += seleccionarLetra(selector);

        return DNI;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    private String seleccionarLetra(int selector){
        switch (selector){
            case 0:
                return "T";
            case 1:
                return "R";
            case 2:
                return "W";
            case 3:
                 return "A";
            case 4:
                return "G";
            case 5:
                return "M";
            case 6:
                return "Y";
            case 7:
                return "F";
            case 8:
                return "P";
            case 9:
                return "D";
            case 10:
                return "X";
            case 11:
                return "B";
            case 12:
                return "N";
            case 13:
                return "J";
            case 14:
                return "Z";
            case 15:
                return "S";
            case 16:
                return "Q";
            case 17:
                return "V";
            case 18:
                return "H";
            case 19:
                return "L";
            case 20:
                return "C";
            case 21:
                return "K";
            case 22:
                return "E";
        }
        return "#";
    }
}