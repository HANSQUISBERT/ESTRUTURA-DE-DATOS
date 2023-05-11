package Defensa_pilas_hito3;


public class PilaEstudiante {
    private int max;     //cantidad maxima
    private int tope;    //elementos
    private Estudiante[] Student;

    public PilaEstudiante()
    {
        this.max=20;
        this.tope=0;
        this.Student = new Estudiante [this.max+1];
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
    public void adicionar(Estudiante nuevoEstudiante)
    {
        if(esLleno()==true){
            System.out.println("PILA DE LIBROS LLENA");
        }else{
            tope=tope+1;
            Student[tope]=nuevoEstudiante;
        }
    }
    public Estudiante eliminar()
    {
        Estudiante EstudianteEliminado = null;

        if(!this.esVacio()){
            EstudianteEliminado = Student[tope];
            tope=tope-1;
        }else{

            System.out.println("PILA DE LIBROS VACIA");
        }
        return EstudianteEliminado;
    }

    public  void llenar(int nroItems)
    {
    }
    public void mostrar()
    {
        Estudiante estudiante=null;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila De Libros: ");
            PilaEstudiante aux=new PilaEstudiante();
            while(!esVacio()){
                estudiante = eliminar();
                aux.adicionar(estudiante);
                estudiante.muestraEstudiante();
            }
            vaciar(aux);
        }


    }
    public void vaciar(PilaEstudiante pila)
    {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
