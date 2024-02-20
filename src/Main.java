// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Nodo primero = new Nodo("eJEMPLO");
        Nodo segundo = new Nodo(100);
        Nodo tercero = new Nodo("Hola mundo");

        //Enlasar nodo primero
        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);
        System.out.println(primero
                .obtenerSiguiente()
                .obtenerSiguiente()
                .getValor()
                .toString());


    }
}