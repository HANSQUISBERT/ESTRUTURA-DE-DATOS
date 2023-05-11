package Defensa_pilas_hito3;

import EDD_ejercicios.PilaNumeros;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Michael", "Calsina", 18, "El Alto", 85, "46561290 LP");
        Estudiante est2 = new Estudiante("Daniel", "Maynaza", 18, "Santa Cruz", 71, "45120387 CB");
        Estudiante est3 = new Estudiante("Kevin", "Barra", 18, "El Alto", 65, "78965412 SCZ");
        Estudiante est4 = new Estudiante("Wilmer", "Lefonzo", 18, "El Alto", 55, "12309865 LP");
        Estudiante est5 = new Estudiante("Elsa", "Villca", 18, "Santa Cruz", 45, "87562301 SCZ");

        PilaEstudiante pila = new PilaEstudiante();
        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);

//        pila.mostrar();
//        determinarAprobados(pila);
        kesimo(pila, 12);
        pila.mostrar();

//        cambiarPosicion(pila, "LP");
//        pila.mostrar();
    }

    public static void determinarAprobados(PilaEstudiante pila){
        PilaEstudiante aux = new PilaEstudiante();

        Estudiante item = null;
        int cont = 0;

        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getNotaFinal() > 51 && item.getSede().equals("El Alto") && item.getCI().endsWith("LP")){
                cont++;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);

        System.out.println("Estudiantes aprobados: "+cont);
    }
    public static void kesimo(PilaEstudiante pila, int k_esim){
        PilaEstudiante aux = new PilaEstudiante();

        Estudiante item=null;
        Estudiante nom =null;

        while (!pila.esVacio())
        {
            item = pila.eliminar();

            if(k_esim < pila.nroElem())
            {
                if(pila.nroElem()+1 == k_esim)
                {
                    nom = item;
                }
            }
            else
            {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(nom);
    }
    public static void menorNota(PilaEstudiante pila){
        PilaEstudiante aux = new PilaEstudiante();
        PilaEstudiante axu = new PilaEstudiante();
        int nota = notaMneorCAl(pila);
        Estudiante item = null, auxi = null;

//        while (!pila.esVacio()){
//            item = pila.eliminar();
//            if()
//        }


    }

    public static int  notaMneorCAl(PilaEstudiante lib) {
        PilaEstudiante aux = new PilaEstudiante();
        Estudiante item = null;
        int mayor = 0;

        while (!lib.esVacio()) {
            item = lib.eliminar();

            if (item.getNotaFinal() < mayor) {
                mayor=item.getNotaFinal();
            }
            aux.adicionar(item);
        }
        lib.vaciar(aux);
        return mayor;
    }
    public static void cambiarPosicion(PilaEstudiante pila, String sede){
        PilaEstudiante aux = new PilaEstudiante();
        PilaEstudiante sedeCI = new PilaEstudiante();

        Estudiante item = null;
        while (!pila.esVacio()){
            item = pila.eliminar();

            if(item.getCI().endsWith(sede)){
                sedeCI.adicionar(item);
            }
            else {
                aux.adicionar(item);
            }
        }
        pila.vaciar(aux);
        pila.vaciar(sedeCI);
    }
}
