package Colas;

public class ColadeNumeros {
    private int max ;
    private int ini ;
    private int fin;
    private int []numeros ;
    public ColadeNumeros() {
        this.max =10;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int [ this.max + 1];
    }
    public boolean esVacia(){
        if(ini == 0 && fin == 0){
              return true;
        }
            else {

            return false; }



    }
    public boolean esLlena(){
        if (fin == max){
            return true;
        }
        else {
            return false;  }

    }
    public void adicionar(int nuevoNumero) {
        if (esLlena()){
            System.out.println("La cola esta LLENA");
        } else {
            fin = fin +1 ;
            numeros [fin] = nuevoNumero;
        }
}
    public int eliminar() {
        int numeroEliminado = 0;
        if (esVacia()){
            System.out.println("La cola se eliminara");
        } else {
            ini = ini +1;
            numeroEliminado = numeros [ ini] ;
        }
        return numeroEliminado;
    }
    public int nroElementos(){
        return fin  - ini;
    }
    public void vaciar (ColadeNumeros cola){
        int elemEliminado;
        while (!cola.esVacia()){
            elemEliminado = cola.eliminar();
            adicionar (elemEliminado);
        }


    }
    public void mostrar (){
        if (esVacia()){
            System.out.println("Cola vacia, no hay items");
        } else {
            int elemEliminado;
            System.out.println("Mostrando los datos de la cola");
            ColadeNumeros aux  = new ColadeNumeros();
            while (!esVacia()){
                elemEliminado = eliminar();
                System.out.println("Mostrar: "+elemEliminado);
                aux.adicionar(elemEliminado);

            }
            vaciar(aux);

        }
    }

}




