
package ulpentidades;

import java.time.LocalDate;


public class Alumno {
    private String nombre;
    private int legajo;
    private LocalDate fnAlumno;
    private boolean activo;

    public Alumno(String nombre, int legajo, LocalDate fnAlumno, boolean activo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.fnAlumno = fnAlumno;
        this.activo = activo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public LocalDate getFnAlumno() {
        return fnAlumno;
    }

    public void setFnAlumno(LocalDate fnAlumno) {
        this.fnAlumno = fnAlumno;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
    
    
}
