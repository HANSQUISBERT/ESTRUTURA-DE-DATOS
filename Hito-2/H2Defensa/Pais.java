package H2Defensa;

public class Pais {
    private int nroDeps;
    private Departamento[] departamentos;
    private String nombre;

    public Pais(){

    }
    public Pais(String nombre, int nroDeps, Departamento[] departamentos){
        this.departamentos = departamentos;
        this.nroDeps = nroDeps;
        this.nombre = nombre;
    }

    public int getNroDeps() {
        return nroDeps;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNroDeps(int nroDeps) {
        this.nroDeps = nroDeps;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPais(){
        System.out.println("Pais: "+this.getNombre());
        System.out.println("Numero de Departamentos: "+this.getNroDeps());
        for(int i = 0; i < this.getNroDeps(); i++)
        {
            this.getDepartamentos()[i].mostrarDepartamento();
        }
    }
    public void agregarDepartamento(Departamento cbba){
        Departamento[] departamentos1 = this.getDepartamentos();
        Departamento[] nuevo = new Departamento[departamentos1.length +1];

        for(int i = 0; i < departamentos1.length;i++)
        {
            nuevo[i]=departamentos1[i];

        }
        nuevo[departamentos1.length ]= cbba;
        setDepartamentos(nuevo);
    }
    public void agregarProvincia(String nomDep, Provincia prov){
        Departamento[] dep = this.getDepartamentos();

        Departamento[] departamentos1 = this.getDepartamentos();
        Departamento[] nuevo = new Departamento[departamentos1.length +1];

        for(int i = 0; i < departamentos1.length;i++)
        {
            if(nomDep == this.getNombre())
            {
                nuevo[i] = departamentos1[i];
            }
        }
        setDepartamentos(nuevo);

    }
}
