package EDD_ejercicios_h3;

import EDD_ejercicios.PilaNumeros;

public class PilaDeCadena {
    private int max;     //cantidad maxima
    private int tope;    //elementos
    private String[] nombre;

    public PilaDeCadena()
    {
        this.max=10;
        this.tope=0;
        this.nombre = new String [this.max+1];
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
    public String adicionar(String nuevaCAD)
    {
        if(esLleno()==true){
            System.out.println("PILA LLENA");
        }else{
            tope=tope+1;
            nombre[tope]=nuevaCAD;
        }
        return nuevaCAD;
    }
    public String eliminar()
    {
        String itemEliminado="";
        if(esVacio()==true){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado = nombre[tope];
            tope=tope-1;
        }
        return itemEliminado;
    }

    public static void llenar(String n)
    {

    }
    public void mostrar()
    {
        String item="";
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila De Cadenas: ");
            PilaDeCadena aux=new PilaDeCadena();
            while(!esVacio()){
                item = eliminar();
                System.out.print(item+", ");
                aux.adicionar(item);
            }
            vaciar(aux);
        }


    }
    public void vaciar(PilaDeCadena pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
