/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alumno;

/**
 *
 * @author carlosmc
 */
public class Recibir extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codalumno=request.getParameter("txtCodigo");
        String nombrealumno=request.getParameter("txtNombre");
        String apellido=request.getParameter("txtApellido");
        
        Alumno al=new Alumno();
        al.setCodalumno(codalumno);
        al.setNombrealumno(nombrealumno);
        al.setApellido(apellido);
        
        try {
            if(al.insertar()==true)
            {
                request.getRequestDispatcher("exito.jsp").forward(request, response);
                
            }
            else{
                request.getRequestDispatcher("nosepudo.jsp").forward(request, response);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Recibir.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
        
        
         
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
