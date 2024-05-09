package sistemaGestion;

import java.util.Date;

public class SistemaGestion {
    private String nombre;
    private String fechaPublicacion;
    private int edicion;

    // Constructor, getters y setters

    public String gestionar() {

        return "";
    }

    public boolean disponibilidad() {

        return false;
    }

    public String verificarHistorial() {

        return "";
    }

    public int cobrar(int deuda) {

        return 0;
    }

    @Override
    public String toString() {
        return "SistemaGestion{" +
                "nombre='" + nombre + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", edicion=" + edicion +
                '}';
    }
}