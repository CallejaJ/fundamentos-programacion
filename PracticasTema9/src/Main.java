public class Main {


    public static void main(String[] args) {
        CocheElectrico cocheElectrico = new CocheElectrico();
        CocheElectrico.velocidadMaxima = 14;
        CocheElectrico.matricula = "0717CWP";

        System.out.println(cocheElectrico.compruebaMatricula("XXX"));
    }
}
    class Vehiculo {
    static int velocidadMaxima;
    static String matricula;

    public boolean compruebaMatricula(String matricula) {
     if (matricula == "XXX"){
         return true;
     }
        return false;
    }
    }

    class Coche extends Vehiculo {
    }

    class CocheElectrico extends Coche{

    }

