package PilaDeClientes;

public class PilaCliente {
    private int max;
    private int tope;
    private Cliente [] cliente;
    public PilaCliente() {
        this.tope = 0;
        this.max = 10;
        this.cliente = new Cliente[this.max + 1];
    }
    public boolean esVacio() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }
    private boolean esLleno() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }
    public int nroElementos() {
        return tope;
    }
    public void adicionar(Cliente nuevoCliente) {
        if (esLleno()) {
            System.out.println("PILA DE CLIENTES LLENA");
        } else {
            tope = tope + 1;
            cliente[tope] = nuevoCliente;
        }
    }
    public Cliente eliminar() {
        Cliente clienteEliminado = null;

        if (esLleno() == true) {
            System.out.println("PILA DE CLIENTES VACIA");
        }
        else {
            clienteEliminado = cliente[this.tope];
            tope = tope - 1;
        }
        return clienteEliminado;
    }
    public void vaciar(PilaCliente pila) {
        while (pila.esVacio() == false) {
            adicionar(pila.eliminar());
        }
    }
    public void mostrar() {
        Cliente es = null;

        if (esVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("\nMostrando la pila de Clientes");
            PilaCliente aux = new PilaCliente();
            while (esVacio() == false) {
                es = eliminar();
                aux.adicionar(es);
                es.mostrarCliente();
            }
            vaciar(aux);
        }
    }





}
