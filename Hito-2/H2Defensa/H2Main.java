package H2Defensa;

public class H2Main {
    public static void main(String[] args) {

        Provincia prov = new Provincia("Murillo");
        Provincia prov2 = new Provincia("Pacajes");

        Provincia[] provincias = new Provincia[100];
        provincias[0] = prov;
        provincias[1] = prov2;

        Provincia prov3 = new Provincia("Chiquitos");
        Provincia prov4 = new Provincia("Cordillera");
        Provincia[] provincias2 = new Provincia[100];

        provincias2[0] = prov3;
        provincias2[1] = prov4;


        Departamento dep = new Departamento("La Paz", 2,provincias);
        Departamento dep2 = new Departamento("Santa Cruz", 2, provincias2);

        Departamento[] departamentos = new Departamento[100];

        departamentos[0] = dep;
        departamentos[1] = dep2;

        Pais pa = new Pais("Bolivia", 2, departamentos);


        pa.mostrarPais();


    }
}
