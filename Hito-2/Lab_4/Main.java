package Manejo_de_pilas;

public class Main
{
    public static void main(String[] args) {
        int[] edadEDD = new int[5];
        edadEDD[0] = 33;
        edadEDD[1] =19;
        edadEDD[2]=20;
        edadEDD[3]=42;
        edadEDD[4]=25;

        int[] edadesDBAII = new int[5];
        edadesDBAII[0] = 30;
        edadesDBAII[1] =20;
        edadesDBAII[2]=19;
        edadesDBAII[3]=15;
        edadesDBAII[4]=25;

        Edades par1 = new Edades("unifranz", "EDD", edadEDD);

        Edades par2 = new Edades("Unifranz", "DBA_II", edadesDBAII);

//        par1.mostrar();
//
//        determinaEdadMayor(par1);

//        numeroPar(par1);
//        par1.mostrar();
//
        par1.mostrar();
        par2.mostrar();

//        intercambiarValores(par1, par2);
////
        intercambiarArray(par1);
        par1.mostrar();
//        par2.mostrar();

    }
    public static int determinaEdadMayor(Edades obj1){
        int[] edad = obj1.getEdades();


        int mayor = edad[0];

        for (int i = 1; i < edad.length; i++) {
            if (edad[i] > mayor) {
                mayor = edad[i];
            }
        }

        System.out.println("Mayor edad : " + mayor);
        return mayor;

    }

    public static void numeroPar(Edades obj1){

        int[] edad = obj1.getEdades();

        for(int i = 0; i < edad.length; i++)
        {
            if(edad[i]%2 == 0)
            {
                edad[i] = edad[i]+5;

            }
        }
        obj1.setEdades(edad);

    }

    public static void intercambiarValores( Edades par1, Edades par2)
    {
        int mayorEDD = determinaEdadMayor(par1);
        System.out.println("Edad mayor EDD: "+mayorEDD);

        int mayorDBA = determinaEdadMayor(par2);
        System.out.println("Edad mayor DBA: "+mayorDBA);
        System.out.println();

        int [] edadesEDD = par1.getEdades();
        for(int i = 0;i < edadesEDD.length;i++)
        {
            if(edadesEDD[i] == mayorEDD)
            {
                edadesEDD[i] = mayorDBA;
            }
        }

        int[] edadesDBA = par2.getEdades();
        for(int i = 0;i < edadesDBA.length;i++)
        {
            if(edadesDBA[i] == mayorDBA)
            {
                edadesDBA[i] = mayorEDD;
            }

        }

        int menorEDD = determinaEdadMenor(par1);
        System.out.println("Edad menor EDD: "+menorEDD);

        int menorDBA = determinaEdadMenor(par2);
        System.out.println("Edad menor DBA: "+menorDBA);
        System.out.println();

        int [] edadesEDD1 = par1.getEdades();
        for(int i = 0;i < edadesEDD1.length;i++)
        {
            if(edadesEDD[i] == menorEDD)
            {
                edadesEDD[i] = menorDBA;
            }
        }

        int[] edadesDBA1 = par2.getEdades();
        for(int i = 0;i < edadesDBA1.length;i++)
        {
            if(edadesDBA[i] == menorDBA)
            {
                edadesDBA[i] = menorEDD;
            }

        }

    }
    public static int determinaEdadMenor(Edades obj1){
        int[] edad = obj1.getEdades();


        int menor = edad[0];

        for (int i = 1; i < edad.length; i++) {
            if (edad[i] < menor) {
                menor = edad[i];
            }
        }

        System.out.println("Menor edad : " + menor);
        return menor;

    }
    public static void intercambiarArray(Edades par1){
        int mayorEDD = determinaEdadMayor(par1);
        System.out.println("Edad mayor EDD: "+mayorEDD);


        int menorEDD = determinaEdadMenor(par1);
        System.out.println("Edad menor EDD: "+menorEDD);

        int [] edadesEDD = par1.getEdades();
        for(int i = 0;i < edadesEDD.length;i++)
        {
            if(edadesEDD[i] == mayorEDD)
            {
                edadesEDD[i] = menorEDD;
            }
            else if (edadesEDD[i]==menorEDD)
            {
                edadesEDD[i] = mayorEDD;
            }
        }
        System.out.println();
    }
}
