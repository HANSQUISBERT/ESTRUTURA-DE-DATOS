package Colas;

public class MainColas {
    public static void main (String [] args) {
        ColadeNumeros  cola1 =  new ColadeNumeros ();
        cola1.adicionar (1);
        cola1.adicionar (7);
        cola1.adicionar (1);
        cola1.adicionar (4);
        cola1.adicionar (5);
        cola1.adicionar (3);

        cola1.mostrar ();


        }

    public static void Multiplosde3(ColadeNumeros cola , int multiplos ){
        int cont =0 ;
        int item = 0;
        ColadeNumeros aux = new ColadeNumeros();

        while (!cola.esVacia()){
            item = cola.eliminar();
            if (item % multiplos == 0 ){
                cont = cont +1;

            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("Multiplos =  "+ cont );
    }
    public static void eliminarelem(ColadeNumeros cola) {
        ColadeNumeros aux = new ColadeNumeros();

        while (!cola.esVacia()) {
            int item = cola.eliminar();
            if (!aux.contiene (item);){
                aux.adicionar(item);
            }
        }

        cola.vaciar(aux);
        System.out.println("Se repiten = " elim );
    }
}



