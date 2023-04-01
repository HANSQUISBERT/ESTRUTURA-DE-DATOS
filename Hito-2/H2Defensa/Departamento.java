package H2Defensa;

public class Departamento {
    private String nombreDep;
    private int nroProv;
    private Provincia[] provincias;

    public Departamento(){

    }
    public Departamento(String nombreDep, int nroProv, Provincia[] provincias){
        this.nombreDep = nombreDep;
        this.nroProv = nroProv;
        this.provincias = provincias;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public int getNroProv() {
        return nroProv;
    }

    public Provincia[] getProvincias() {
        return provincias;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public void setNroProv(int nroProv) {
        this.nroProv = nroProv;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }


    public void mostrarDepartamento(){
        System.out.println("Departamento: "+this.getNombreDep());
        System.out.println("Numero de Provincias: "+this.getNroProv());
        for(int i = 0; i < this.getNroProv();i++) {

            this.getProvincias()[i].mostrarProvincia();
        }
        System.out.println();
    }

}
