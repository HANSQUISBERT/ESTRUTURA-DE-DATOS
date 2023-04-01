public class Provincia {
    private String Nombre;

    public Provincia(){
        Nombre = "";
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre ){
        this.Nombre = nombre;
    }

    public void mostrarProvincia(){
        System.out.println("Provincia: "+this.getNombre());
    }
}
