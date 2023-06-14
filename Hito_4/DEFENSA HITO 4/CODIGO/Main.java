package ColaDeClientes;

public class Main {
    //nro 12:
    public static void main(String[] args) {
        Cliente c1 = new Cliente("DARIO", "QUISPE", 20, "Brasil", "Masculino", "Silver");
        Cliente c2 = new Cliente("DIANA", "CUSI", 30, "Chile", "Femenino", "Gold");
        Cliente c3 = new Cliente("MARCO", "QUISPE", 80, "Mexico", "Masculino", "Vip");
        Cliente c4 = new Cliente("SAUL", "AGUSTIN", 50, "Paraguay", "Masculino", "Silver");
        Cliente c5 = new Cliente("ANTONELA", "PRADO", 65, "Bolivia", "Femenino", "Gold");


        ColaDeClientes colaCli = new ColaDeClientes(100);
        colaCli.insertar(c1);
        colaCli.insertar(c2);
        colaCli.insertar(c3);
        colaCli.insertar(c4);
        colaCli.insertar(c5);


        Cliente c6 = new Cliente("CARLOS", "GRIS", 20, "Brasil", "Masculino", "Silver");
        Cliente c7 = new Cliente("HEBER", "CUSI", 30, "Chile", "Femenino", "Gold");
        Cliente c8 = new Cliente("JOAN", "AUZ", 80, "Mexico", "Masculino", "Vip");
        Cliente c9 = new Cliente("GUZ", "PAZ", 50, "Paraguay", "Masculino", "Silver");
        Cliente c10 = new Cliente("MAGDALENA", "PEREZ", 65, "Brasil", "Femenino", "Gold");

        ColaDeClientes colaCli2 = new ColaDeClientes(100);
        colaCli2.insertar(c6);
        colaCli2.insertar(c7);
        colaCli2.insertar(c8);
        colaCli2.insertar(c9);
        colaCli2.insertar(c10);

        colaCli2.mostrar();

        //cambiarTipoCliente(colaCli, "Bolivia", "Gold");
        //mover_Clientes_Por_Edad(colaCli, 60);

        //(colaCli,colaCli2,"SAUL");
        mover_Clientes_Por_Nombre_2(colaCli,colaCli2,"SAUL");
    }

//13.Promoción para usuarios de Bolivia.
//○ En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
//    en cuanto a precios en viajes a nivel nacional.
//■ A todos los clientes que sean de nacionalidad boliviana y además el tipo
//    de cliente GOLD, convertir a estos clientes en VIP
//■ Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
//○ El método estático dentro de la clase MAIN recibe 3 atributos
//■ La cola de clientes
//■ El tipo de cliente
//■ La nacionalidad del cliente.

    public static void cambiarTipoCliente(ColaDeClientes colaCli, String nacionalidad, String tipoCliente) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getPais().equals(nacionalidad) && c.getTipo().equals(tipoCliente)) {
                c.setTipo("VIP");
                colaAux.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
    }

//14.Moviendo clientes en la cola.
//○ Mover al inicio todos los clientes mayores a 60 años.
//■ Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
//            ○ El método recibe 2 parámetros
//■ La Cola de Clientes
//■ El valor(int) de la edad.

    public static void mover_Clientes_Por_Edad(ColaDeClientes colaCli, int edad) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getEdad() > edad) {
                colaAux.insertar(c);
            } else {
                colaAux2.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        while (!colaAux2.esVacio()) {
            colaCli.insertar(colaAux2.eliminar());
        }
        colaCli.mostrar();
    }

//15.Moviendo clientes entre 2 colas.
//○ Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos
//    clientes.
//■ Crear 2 colas con 5 clientes.
//■ Todos los clientes cuyo nombre sea Saul deberán ser agregados a la  cola B.

    public static void mover_Clientes_Por_Nombre(ColaDeClientes colaCli, ColaDeClientes colaCli2, String nombre) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getNombre().equals(nombre)) {
                colaCli2.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
        colaCli2.mostrar();
    }

    public static void mover_Clientes_Por_Nombre_2(ColaDeClientes colaCli, ColaDeClientes colaCli2,String nombre) {
        int nroElemColaA = colaCli.nroElementos();
        int nroElemColaB = colaCli2.nroElementos();
        ColaDeClientes aux = new ColaDeClientes(100);
        ColaDeClientes aux2 = new ColaDeClientes(100);

        Cliente valorEliminado = null;
        for (int i = 1; i <= nroElemColaA; i++) {
            valorEliminado = colaCli.eliminar();
            if (valorEliminado.getNombre().equals(nombre)) {
                colaCli2.insertar(valorEliminado);
            } else {
                colaCli.insertar(valorEliminado);
            }
        }
        for (int i = 1; i <= nroElemColaB; i++) {
            valorEliminado = colaCli2.eliminar();
            if (valorEliminado.getNombre().equals(nombre)) {
                colaCli2.insertar(valorEliminado);
            } else {
                aux2.insertar(valorEliminado);
            }
        }
        colaCli.vaciar(aux);
        colaCli2.vaciar(aux2);
        colaCli.mostrar();
        colaCli2.mostrar();
    }

}

