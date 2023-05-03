package Libros;

import java.util.Scanner;

public class PilaDeLibros {
    private int max;     //cantidad maxima
    private int tope;    //elementos
    private Libro[] Libros;

    public PilaDeLibros()
    {
        this.max=10;
        this.tope=0;
        this.Libros = new Libro [this.max+1];
    }
    public boolean esVacio()
    {
        if(this.tope==0)
        {
            return true;
        }else
        {
            return false;
        }
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
    public void adicionar(Libro nuevoLibro)
    {
        if(esLleno()==true){
            System.out.println("PILA DE LIBROS LLENA");
        }else{
            tope=tope+1;
            Libros[tope]=nuevoLibro;
        }
    }
    public Libro eliminar()
    {
        Libro libroEliminado = null;

        if(!this.esVacio()){
            libroEliminado = Libros[tope];
            tope=tope-1;
        }else{

            System.out.println("PILA DE LIBROS VACIA");
        }
        return libroEliminado;
    }

    public  void llenar(int nroItems)
    {
//        Scanner leer = new Scanner(System.in);
//        String nombre = "";
//
//        System.out.println("Llenando la Pila de Nombres (cadenas)");
//
//        for(int i =0 ; i < nroItems; i++){
//            System.out.print("Ingrese el nombre: "+ (i+1)+": ");
//            nombre = leer.nextLine();
//            adicionar(nombre);
//
//            System.out.println();
//        }
    }
    public void mostrar()
    {
        Libro libro=null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila De Libros: ");
            PilaDeLibros aux=new PilaDeLibros();
            while(!esVacio()){
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarLibro();
            }
            vaciar(aux);
        }


    }
    public void vaciar(PilaDeLibros pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
