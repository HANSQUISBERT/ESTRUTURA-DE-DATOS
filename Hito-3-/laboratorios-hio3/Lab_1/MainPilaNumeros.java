package EDD_ejercicios;

public class MainPilaNumeros {
    public static void main(String[] args) {
        PilaNumeros pila1 = new PilaNumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(5);

//        pila1.mostrar();
//        System.out.println();
//        cambiarPosicion(pila1);
//        pila1.mostrar();
//        numeroMayor(pila1);
//        pila1.mostrar();
//        pila1.mostrar();
//        numeros5(pila1, 5);
//        pila1.mostrar();
//        ContarNumParImpar(pila1);

//        agregar_base(pila1,100);
//        pila1.mostrar();
    }
    public static int numeroMayor(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();

        int num = 0;
        int max = 0;
//        int max = Integer.MIN_VALUE;

        while(!pila.esVacio() ){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        return max;
    }
    public static void numeros5(PilaNumeros pila, int buscar){
        PilaNumeros aux = new PilaNumeros();
        int num = 0;
        int cont = 0;

        while (!pila.esVacio()){
            num = pila.eliminar();
            if(num == buscar){
                cont++;
            }
            aux.adicionar(num);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad: "+cont);
    }
    public static int numeroMenor(PilaNumeros pila){

        PilaNumeros aux = new PilaNumeros();

        int numActual = 0;
        int menor = pila.eliminar();
        pila.adicionar(menor);

//        int menor = Integer.MAX_VALUE;

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
    public static void cambiarPosicion(PilaNumeros pila){
        int numeroMayor1 = numeroMayor(pila);
        int numeroMenor = numeroMenor(pila);

        int numPila1 = 0;

//        System.out.println("Mayor: "+numeroMayor1);
//        System.out.println("Menor: "+numeroMenor);

        PilaNumeros aux1 = new PilaNumeros();


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
    public static void ContarNumParImpar(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros();
        int contPar = 0;
        int contImpar = 0;
        int numAct = 0;

        while (!pila.esVacio()){
            numAct = pila.eliminar();

            if(numAct%2 == 0){
                contPar++;
            }
            else{
                contImpar++;
            }
            aux.adicionar(numAct);
        }
        pila.vaciar(aux);
        System.out.println("Pares: "+ contPar);

        System.out.println("Impares: "+ contImpar);
    }
    public static void agregar_base(PilaNumeros pila, int agregar){
        PilaNumeros aux = new PilaNumeros();
        int numAct = 0;

        aux.vaciar(pila);
        aux.adicionar(agregar);
        pila.vaciar(aux);
    }


}
