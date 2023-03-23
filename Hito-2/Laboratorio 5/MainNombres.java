package pilas;

public class MainNombres {
    public static void main(String[] args) {

        String[] NombresEDD = new String [5];
        NombresEDD [0]="Ana";
        NombresEDD [1]="Juan";
        NombresEDD [2]="Pepito";
        NombresEDD [3]="Carla";
        NombresEDD [4]="Freddy";
      Nombres edd  = new Nombres ("EDD", NombresEDD);
      int c = ContarNombres(edd,"Pepito");
      System.out.println("cantidad: "+c);
     // agregarNombrePrincipio(edd,  "Delia");
      //edd.mostrarNombres();
        edd.mostrarNombres();
        agregarNombreFinal(edd, "Wilma");
        edd.mostrarNombres();
    }
    //crear un metodo estatico que determine cuantas personas del paralelo EDD tienen el nombre P
    //Pepito
    // cuentaNombres(edd);

    public static int ContarNombres(Nombres edd,String nombrebuscar)
    {
        String[] nombre1 =edd.getNombres();
         int contador =0;
         for ( int i =0; i < nombre1.length ; i ++)
        {
            if(nombre1 [i] == nombrebuscar)
            {
                contador ++ ;
            }
        }
         return contador ;

    }
    public static void agregarNombrePrincipio (Nombres edd, String nombreAgregar)  {
        String[] NombresOri = edd.getNombres();
        String[] nuevosNombres = new String[NombresOri.length +1];

        nuevosNombres[0] = nombreAgregar ;

        for (int i=0; i < NombresOri.length; i++) {
            nuevosNombres[i+1] = NombresOri[i];
        }

            edd.setNombres(nuevosNombres);
    }
    public static void agregarNombreFinal (Nombres edd, String nuevoNombre)  {
        String[] NombresOri = edd.getNombres();
        String[] nuevosNombres = new String[NombresOri.length +1];



        for (int i=0; i < NombresOri.length; i++) {
            nuevosNombres[i] = NombresOri[i];
        }

        nuevosNombres[NombresOri.length] = nuevoNombre;
        edd.setNombres(nuevosNombres);
    }
}