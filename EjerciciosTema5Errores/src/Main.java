public class Main {
    public static void main(String[] args) {

        double temperatura = 15.9;
        int temperaturaInt = (int)temperatura;
                imprimeTemperatura(temperaturaInt);
           }
           public static void
    imprimeTemperatura(int valor){
        System.out.println(valor);
           }
}
// este es un fenómeno de pérdida de precisión en conversión de tipos
// convierto un valor flotante en un valor entero
// he perdido valores por el camino
// la solución es cambiar el parámetro que establece esta función