package EjerciciosHito3;

public class PilasNumeros {
    private int max;
    private int tope;
    private int[] numeros;

    public PilasNumeros()
    {
        this.max=10;
        this.tope=0;
        this.numeros=new int [this.max+1];
    }
    public boolean esVacio()
    {
        if(this.tope==0)
        {
            return true;
        }else{
            return false;}
    }
    public boolean esLleno()
    {
        if(tope==max){
            return true;
        }else{
            return false;
        }

    }
    public int nroElem()
    {
        return this.tope;
    }
    public  int adicionar(int nuevoNum)
    {
        if(esLleno()==true){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            numeros[tope]=nuevoNum;
        }
        return nuevoNum;
    }
    public int eliminar()
    {
        int itemEliminado=0;
        if(esVacio()==true){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado=numeros[tope];
            tope=tope-1;
        }
        return itemEliminado;
    }

    public static void llenar(int n)
    {

    }
    public void mostrar()
    {
        int item=0;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la PILA DE NUMEROS: ");
            PilasNumeros aux=new PilasNumeros();
            while(!esVacio()){
                item = eliminar();
                System.out.print(item+", ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }


    }
    public void vaciar(PilasNumeros pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
