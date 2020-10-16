
package ulpentidades;
import ULP.modelo.Conexion;
import ULP.modelo.AlumnoData;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class ULP {

    
    public static void main(String[] args) {
        Alumno a = new Alumno ("juancito",1,LocalDate.of(1998, 2, 13),true);
        Conexion c = new Conexion();
        AlumnoData ad= new AlumnoData(c);
        ad.cargarAlumno(a);
    }
    
}
