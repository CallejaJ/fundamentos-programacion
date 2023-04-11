public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2,90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche {

    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {

        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor");

    }

    public Coche ( int puertas, int velocidad){

            numeroDePuertas = puertas;
            velocidadMaxima = velocidad;
            System.out.println("Estoy en el constructor con parámetros");
        }

    }

