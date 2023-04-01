package H2Defensa;

public class Provincia {
    private String nombreProv;

    public Provincia(){

    }
    public Provincia(String nom){
        this.nombreProv = nom;
    }
    public String getNombre(){
        return nombreProv;
    }
    public void setNombre(String nom){
        this.nombreProv = nom;
    }

    public void mostrarProvincia(){
        System.out.println("Provincia: "+this.getNombre());
    }
}
