package Manejo_de_pilas;

public class Main1 {
    public static void main(String[] args) {
        String[] nombresEDD = new String[5];
        nombresEDD[0]="Ana";
        nombresEDD[1]="Juan";
        nombresEDD[2]="Pepito";
        nombresEDD[3]="Carla";
        nombresEDD[4]="Freddy";

        Nombres  edd = new Nombres("EDD", nombresEDD);

        //crear un metodo estatico que determine cuantas personas del paralelo EDD tienen el nombre Pepito
        cuentaNombres(edd);

        System.out.println("Cantidad: "+ cuentaNombres(edd));
    }
    public static int cuentaNombres(Nombres edd)
    {
        String[] nombre1 = edd.getNombres();
        int contador = 0;
        for (int i =0; i < nombre1.length; i++)
        {
            if(nombre1.equals("Pepito"))
            {
                contador++;
            }
        }
        return contador;
    }
}
