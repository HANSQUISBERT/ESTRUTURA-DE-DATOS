public class Departamento {
    private String nombreDep;
    private Provincia[] nroProvincia;

    public Departamento(){
        nroProvincia = new Provincia[0];
    }


    public Provincia[] getNroProvincia(){
        return nroProvincia;
    }
    public String getNombreDep(){
        return nombreDep;
    }

    public void setNroProvincia(Provincia[] provincia){
        this.nroProvincia = provincia;
    }
    public void setNombreDep(String Nombre){
        this.nombreDep = Nombre;
    }
    public void mostrarDepartamento(int comienzo)
    {

        for(int i = comienzo; i < this.getNroProvincia().length;i++){

            this.getNroProvincia()[i].mostrarProvincia();

        }
    }
    public void agregarProvincia(String newProv){

        Provincia[] oriProv = this.getNroProvincia();
        Provincia[] newProvi = new Provincia[oriProv.length+1];

        newProvi[oriProv.length] = new Provincia();
        newProvi[oriProv.length].setNombre(newProv);


        for(int i = 0; i < this.getNroProvincia().length; i++){
            newProvi[i]=new Provincia();
            newProvi[i] = oriProv[i];
        }

        setNroProvincia(newProvi);
    }
}
