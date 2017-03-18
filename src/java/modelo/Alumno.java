/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import conexion.clsConexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlosmc
 */
public class Alumno {

 
    
    String codalumno;
    String nombrealumno;
    String apellido;
    
    
    Statement state;
    ResultSet rs;
    Connection cnn;
    
    
    public Alumno(){
        
        
    }
       public Alumno(String codalumno, String nombrealumno, String apellido) {
        this.codalumno = codalumno;
        this.nombrealumno = nombrealumno;
        this.apellido = apellido;
    }

    public boolean insertar() throws ClassNotFoundException{
        try {
            int saber=0;
            String query="insert into alumno values ('"+ codalumno +"','"+ nombrealumno + "','" + apellido + "')";
            cnn=clsConexion.obtener();
            state=cnn.createStatement();
            saber=state.executeUpdate(query);
            //clsConexion.cerrar();
            if (saber==1){
                return true;
                        
            }
                        
        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ArrayList<Alumno> consultar(){
        ArrayList<Alumno> Alumnos=new ArrayList<>();
        
        
        try {
            String query="select *from alumno";
            cnn=clsConexion.obtener();
            state=cnn.createStatement();
            rs=state.executeQuery(query);
            while(rs.next()){
                Alumnos.add(new Alumno(rs.getString("codalumno"),rs.getString("nombrealumno"),rs.getString("apellido")));
                
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Alumnos;
          
                
    }
    
    public String getCodalumno() {
        return codalumno;
    }

    public void setCodalumno(String codalumno) {
        this.codalumno = codalumno;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
