public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.sumaNumeros(2.3,2.5);
    }
}
// ëste es un ejercicio de polimorfismo
    class Vehiculo {
    public void diHola() {
        System.out.println("Hola!!");
    }
}

    class Coche extends Vehiculo {
        public void diHola() {
        System.out.println("Soy un coche");
    }
    public int sumaNumeros (int a, int b) {

        System.out.println("Soy el suma numeros de INT");
        return a + b;
    }
    public float sumaNumeros(float a, float b) {

        System.out.println("Soy el suma numeros de FLOAT");
        return a + b * (float) 9.0;
    }
    public void sumaNumeros(double a, double b) {
        System.out.println("El resultado es: " + (a + b));
        System.out.println("Soy el suma numeros de DOUBLE");

    }
}