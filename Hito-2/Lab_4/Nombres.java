package Manejo_de_pilas;

public class Nombres {
    private String paralelo;
    private String[] nombres;
    public Nombres(String paralelo, String[] nombres){
        this.paralelo = paralelo;
        this.nombres = nombres;
    }
    public String getParalelo(){
        return paralelo;
    }
    public String[] getNombres()
    {
        return nombres;
    }
    public void setParalelo(String paralelo)
    {
        this.paralelo = paralelo;
    }
    public void setNombres(String[] nombres)
    {
        this.nombres = nombres;
    }
}
