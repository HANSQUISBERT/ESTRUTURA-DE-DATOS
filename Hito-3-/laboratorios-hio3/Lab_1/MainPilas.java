package EjerciciosHito3;

public class MainPilas {
    public static void main(String[] args) {

        PilasNumeros pila1 = new PilasNumeros();
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);
        pila1.adicionar(2);
        pila1.adicionar(10);

        pila1.mostrar();
        System.out.println();
        cambiarPosicion(pila1);
        pila1.mostrar();

//        System.out.println(" MAYOR: "+numeroMenor(pila1));

    }

    public static int numeroMayor(PilasNumeros pila){
        PilasNumeros aux=new PilasNumeros();
        int num=0;
        int max=0;
        while(!pila.esVacio()){
            num= pila.eliminar();
            if(num>max){
                max=num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
//        System.out.println(" MAYOR: "+max);
        return max;
    }
    public static int numeroMenor(PilasNumeros pila){


        PilasNumeros aux = new PilasNumeros();

        int numActual = 0, auxiliar = 0;
        int menor = pila.eliminar();
        pila.adicionar(menor);

        while (!pila.esVacio()) {

            numActual =pila.eliminar();

            if (numActual < menor)
            {
                menor = numActual;
            }

            aux.adicionar(numActual);

        }
        pila.vaciar(aux);
        return menor;

    }
    public static void cambiarPosicion(PilasNumeros pila){
        int numeroMayor1 = numeroMayor(pila);
        int numeroMenor = numeroMenor(pila);

        int numPila1 = 0;

        System.out.println("Mayor: "+numeroMayor1);
        System.out.println("Menor: "+numeroMenor);

        PilasNumeros aux1 = new PilasNumeros();


        while (!pila.esVacio()){

            numPila1 = pila.eliminar();

            if(numeroMayor1 ==numPila1){
                aux1.adicionar(numeroMenor);
            }

           else if(numeroMenor == numPila1){
                aux1.adicionar(numeroMayor1);
            }
            else {

                aux1.adicionar(numPila1);
            }

        }
        pila.vaciar(aux1);
    }
}
