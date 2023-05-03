package Libros;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Homero", 500, 30.00,"La Odisea", "Historia");
        Libro libro2 = new Libro("Homero", 300, 20.00,"La Iliada", "Historia");

        PilaDeLibros pila = new PilaDeLibros();
        pila.adicionar(libro1);
        pila.adicionar(libro2);

        Libro libro3 = new Libro("Juan", 300, 45.00,"La Iliada", "Historia");
        Libro libro4 = new Libro("Romero", 300, 32.00,"La Iliada", "Historia");

        PilaDeLibros pilaB = new PilaDeLibros();
        pilaB.adicionar(libro3);
        pilaB.adicionar(libro4);

//        pila.mostrar();
//        determinar( pila, 25);
//        descuento(pila, "Historia");
//        System.out.println(PrecioMayor(pilaB));
        cambiar(pila, pilaB);
        pila.mostrar();
        pilaB.mostrar();
    }
    public static void determinar(PilaDeLibros pila, double precio){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        int cont = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getPrecio() > precio){
                cont++;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Libros con precio mayor a "+precio+" : " +cont);
    }
    public static void descuento(PilaDeLibros pila, String cat){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        double descuento = 0, total = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();
            if(item.getCategoria() == cat){
                descuento = item.getPrecio();
                total = descuento*(0.1);
                total = descuento-total;
                item.setPrecio(total);
            }

            aux.adicionar(item);
        }
        pila.vaciar(aux);

    }
    public static void cambiar(PilaDeLibros pilaA, PilaDeLibros pilaB){

        PilaDeLibros aux= new PilaDeLibros();
        PilaDeLibros auxB= new PilaDeLibros();

        Double precioA = PrecioMayor(pilaA);
        Double precioB = PrecioMayor(pilaB);
        Libro itemA = null, itemB = null;

        while (!pilaA.esVacio() && !pilaB.esVacio()){
            itemA = pilaA.eliminar();
            itemB = pilaB.eliminar();

            if(itemA.getPrecio() == precioA){
                auxB.adicionar(itemA);
            } else if (itemB.getPrecio() == precioB) {
                aux.adicionar(itemB);

            }
            else{
                aux.adicionar(itemA);
                auxB.adicionar(itemB);
            }

        }
        pilaA.vaciar(aux);
        pilaB.vaciar(auxB);
    }
    public static Double  PrecioMayor(PilaDeLibros lib){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        double mayor = 0;
        while (!lib.esVacio()){
            item = lib.eliminar();
            if(item.getPrecio() > mayor){
                mayor = item.getPrecio();
            }
            aux.adicionar(item);
        }
        lib.vaciar(aux);
        return mayor;
    }
}
