public class Pais {
    private String nombre;
    private int nroDepartamento;
    private Departamento[] departamentos;

    public Pais(){
        this.nombre = " ";
        this.nroDepartamento = 0;
        this.departamentos = new Departamento[0];
    }
    public String getNombre(){
        return nombre;
    }
    public int getNroDepartamento(){
        return nroDepartamento;
    }
    public Departamento[] getDepartamentos(){
        return departamentos;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDepartamentos(Departamento[] departamentos){
        this.departamentos = departamentos;
    }
    public void setNroDepartamento(int numero){
        this.nroDepartamento = numero;
    }


    public void muestraPais(int comienza){

        for(int i = comienza; i<this.getNroDepartamento();i++){
            System.out.println("Departamento: "+this.getDepartamentos()[i].getNombreDep());
        }
    }
    public void agregarDepartamento(String agDep){

        Departamento[] oriDep = this.getDepartamentos();
        Departamento[] newDep = new Departamento[oriDep.length+1];

        newDep[oriDep.length]=new Departamento();
        newDep[oriDep.length].setNombreDep(agDep);

        setNroDepartamento(newDep.length);

        for(int i = 0; i < oriDep.length; i++){
            newDep[i]=new Departamento();
            newDep[i] = oriDep[i];
        }
        setDepartamentos(newDep);


    }


}
