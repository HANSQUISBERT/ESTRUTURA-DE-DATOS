package PilaDeClientes;

public class Main {
    public static void main(String[] args) {

        Cliente clien1 = new Cliente("Jose","Perez",16,"Los Andes","Masculino");
        Cliente clien2 = new Cliente("Antonio","Cusi",23,"Rio Seco","Masculino");
        Cliente clien3 =  new Cliente("Carla","Quispe",34,"Extranca","Femenino");
        Cliente clien4 =    new Cliente("Ana","Torrez",23,"Calacoto","Femenino");
        Cliente clien5 =  new Cliente("Cielo","Carrasco",25,"San Miguel","Femenino");

        PilaCliente pila = new PilaCliente();

        pila.adicionar(clien1);
        pila.adicionar(clien2);
        pila.adicionar(clien3);
        pila.adicionar(clien4);
        pila.adicionar(clien5);



        System.out.println("---");
        System.out.println("---");
        System.out.println("---");

        pila.mostrar();

        System.out.println("----");
        System.out.println("----");
        System.out.println("----");

        EdadMayor_20(pila, 20);


        System.out.println("---");
        System.out.println("----");
        System.out.println("---");

        kEsimoPosicion(pila,3);
        pila.mostrar();

        System.out.println("----");
        System.out.println("----");
        System.out.println("----");

        asignaDireccion(pila,"BELLA VISTA");
        pila.mostrar();

        System.out.println("-----");
        System.out.println("----");
        System.out.println("----");

        reordenaPila(pila);
        pila.mostrar();

    }
    public static void  EdadMayor_20(PilaCliente pila, int edad){
        PilaCliente aux = new PilaCliente();
        Cliente es = null;
                int cont = 0;
        while (!pila.esVacio()){
            es = pila.eliminar();
            if(es.getEdad()> edad){
                cont = cont +1 ;
            }
            aux.adicionar(es);
        }
        pila.vaciar(aux);
        System.out.printf("\nClientes con una edad mayor a "+ edad + "años: " +cont);

    }
    public static void kEsimoPosicion(PilaCliente pila, int valorTope){
        PilaCliente aux = new PilaCliente();
        Cliente nombkesimo = null;
        Cliente  clienteBorrado;
        while(!pila.esVacio()) {
            clienteBorrado = pila.eliminar();
            if (pila.nroElementos() + 1 == valorTope) {
                nombkesimo = clienteBorrado;
        } else {
               aux.adicionar(clienteBorrado);
    }

}
        pila.vaciar(aux);
        pila.adicionar(nombkesimo);
    }
    public static void asignaDireccion(PilaCliente pila, String NuevaDireccion){

        PilaCliente aux = new PilaCliente();
        Cliente es = null;
        int cont = 0;

        while (!pila.esVacio())
        {
            es = pila.eliminar();
            if(es.getGenero()=="Femenino"){
                cont = cont +1;
            }
            if (es.getGenero()=="Femenino"){
                es.setDireccion(NuevaDireccion);
            }
            aux.adicionar(es);
        }
        pila.vaciar(aux);
    }
    public static void reordenaPila(PilaCliente pila){
        PilaCliente aux = new PilaCliente();
        PilaCliente auxMasculinos = new PilaCliente();
        PilaCliente auxFemeninos = new PilaCliente();
        Cliente es;
        while(!pila.esVacio()){
            es = pila.eliminar();
            if (es.getGenero().equals("Masculino")) {
                auxMasculinos.adicionar(es);
            }
            else{
                auxFemeninos.adicionar(es);
            }

            }
        pila.vaciar(aux);
        while (!auxMasculinos.esVacio()) {
            es = auxMasculinos.eliminar();
            pila.adicionar(es);

    }
        while (!auxFemeninos.esVacio()) {
            es = auxFemeninos.eliminar();
            pila.adicionar(es);
        }
    }

}


