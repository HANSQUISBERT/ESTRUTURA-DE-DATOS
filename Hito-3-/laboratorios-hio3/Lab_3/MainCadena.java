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

//        cad.llenar(12);
//        cuentaAndres(cad, "Andres");
//        agregar(cad,"Andres", "ANA");

        cambiar(cad, 3);
        cad.mostrar();
    }
    public static void cuentaAndres(PilaDeCadena pila, String buscarNom){
        PilaDeCadena aux = new PilaDeCadena();

        int cont =0;
        String nombre;

        while (!pila.esVacio()){
            nombre = pila.eliminar();
//            if(nombre == buscarNom){
//                cont++;
//            }
            if(nombre.equals(buscarNom)){
                cont++;
            }
            aux.adicionar(nombre);
        }
        pila.vaciar(aux);

        System.out.println("El nombre "+buscarNom+" se repite: "+cont);
        System.out.println();
    }
    public static void agregar(PilaDeCadena pila,String nom ,String nombreAgregar){
        PilaDeCadena aux = new PilaDeCadena();
        String nombre;

        while (!pila.esVacio()){
            nombre = pila.eliminar();

            if(nombre.equals(nom)){
//                aux.adicionar(nombre);
//                aux.adicionar(nombreAgregar);
                aux.adicionar(nombreAgregar);
            }
                aux.adicionar(nombre);

        }
        pila.vaciar(aux);
    }
    public static void intercambiaItems(PilaDeCadena pila){
        PilaDeCadena aux = new PilaDeCadena();
        String item1 = pila.eliminar();
        aux.vaciar(pila);
        String item2 = aux.eliminar();

        pila.adicionar(item1);
        pila.vaciar(aux);
        pila.adicionar(item2);

    }
    public static void cambiar(PilaDeCadena pila, int kesimo){
        PilaDeCadena aux = new PilaDeCadena();
        String item="";
        String nom ="";

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(pila.nroElem()+1== kesimo){
                 nom = item;
            }else {
            aux.adicionar(item);}
        }
        pila.vaciar(aux);
        pila.adicionar(nom);

    }
}
