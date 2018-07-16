/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.IdeaBean;
import Beans.RegisterUserBean;
import Database.DBconnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sanda
 */
@WebServlet(name = "ideahub", urlPatterns = {"/ideahub"})
public class ideahub extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ideahub</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ideahub at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        PrintWriter out =response.getWriter();
       
        IdeaBean ib = new IdeaBean(request.getParameter("comment"));
   
        //String nme=ib.getNme();
         Object user = request.getSession().getAttribute("un");
        String comment=ib.getComment();
       
       
  
   
    try{
       
              Connection conn = DBconnect.ConnectDb();
              
         
              PreparedStatement pst = null;
              
             
              
              String query= "insert into ideahub (user,Comments)values(?,?)";
              
              
              pst=conn.prepareStatement(query);
              
             // pst.setString(1,nme);
             pst.setString(1, (String) user);
              pst.setString(2,comment);
              
             
              pst.executeUpdate();
              pst.close();
            

           response.sendRedirect("http://localhost:8080/Project3%20old/shape/ideahub.jsp");

        
    }catch(Exception e){
       
       out.print(e);
                 
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
