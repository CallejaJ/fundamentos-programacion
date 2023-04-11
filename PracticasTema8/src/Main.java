public class Main {



    public static void main(String[] args) {
            Vehiculo coche = new Vehiculo();
            coche.setTipo("Coupé");
            coche.setVelocidadMaxima(120);
            coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

            System.out.println(coche.getTipo());
            System.out.println(coche.getVelocidadMaxima());
            System.out.println(coche.isRapido());
    }


}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    public boolean rapido;
    public void setRapido(boolean rapido) {
        this.rapido = rapido;
}
    public boolean isRapido() {
        return this.rapido;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setTipo(String Tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}



