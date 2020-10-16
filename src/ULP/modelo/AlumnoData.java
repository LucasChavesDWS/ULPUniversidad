package ULP.modelo;

import ULP.modelo.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ulpentidades.Alumno;

public class AlumnoData {
    private Connection c;

    public AlumnoData(Conexion cc){
    
        c=  cc.getConnection();
    }
    
    public void cargarAlumno (Alumno al){
        String sql= "INSERT into alumno (nombre_alumno,legajo,nac,activo) "
                +"VALUES (?,?,?,?)";
        
        try{
            //PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString (1, al.getNombre());
            ps.setInt(2, al.getLegajo());
            ps.setDate(3, Date.valueOf(al.getFnAlumno()));
            ps.setBoolean(4, al.isActivo());
            
        
        ps.executeUpdate();
        
        ResultSet r = ps.getGeneratedKeys();

            if (r.next()) {
                al.setLegajo(r.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        c.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Alumno");
        }
       
    }
    
    
}
