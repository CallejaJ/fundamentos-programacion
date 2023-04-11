public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    coche.setSonido("BRR");
        System.out.println(coche.getSonido());
    }
}
    // Este ejercicio es de abstracción y herencia simple
    abstract class Vehiculo {
    int VelocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("estoy en el constructor de Vehiculo");
        }

        abstract public String getSonido();
        abstract public void setSonido(String sonido);
    }
    class Coche extends Vehiculo {
                public String getSonido() {
                return "Soy un supersonido: " + this.sonido;
        }

                public void setSonido(String sonido) {
                this.sonido = sonido;
        }
    }

    class Moto extends Vehiculo {
        public String getSonido() {
            return "Soy un sonidillo de moto: " + this.sonido;
        }

        public void setSonido(String sonido) {
            this.sonido = sonido;

        }

        }