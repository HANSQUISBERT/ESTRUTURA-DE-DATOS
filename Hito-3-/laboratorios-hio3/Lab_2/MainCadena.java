package EDD_ejercicios_h3;

public class MainCadena {
    public static void main(String[] args) {
        PilaDeCadena cad = new PilaDeCadena();
        cad.adicionar("William");
        cad.adicionar("Andres");
        cad.adicionar("Josias");
        cad.adicionar("Iris");
        cad.adicionar("Jonathan");
        cad.adicionar("Ilia");

        cad.mostrar();
    }
}
