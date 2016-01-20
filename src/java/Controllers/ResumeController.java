/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ResumeBeanModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author timothy
 */
@WebServlet(name = "ResumeController", urlPatterns = {"/ResumeController"})
public class ResumeController extends HttpServlet {

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
        processRequest(request, response);
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
        processRequest(request, response);
        ResumeBeanModel rbm = new ResumeBeanModel();
        List <String> ls = new ArrayList<String>();
        String education = request.getParameter("Education");
        String achievements = request.getParameter("Achievements");
        String skills = request.getParameter("Skills");
        String jobHistory = request.getParameter("Job History");
        String volunteer = request.getParameter("Volunteer");
        String goals = request.getParameter("Goals");

      
        if(education != null){
            ls.add(rbm.getEducation());
        }
            if(achievements != null){
            ls.add(rbm.getAchievements());
        }
            if(skills != null){
            ls.add(rbm.getSkills());
        }
            if(jobHistory != null){
            ls.add(rbm.getJobHistory());
        }
            if(volunteer != null){
            ls.add(rbm.getVolunteer());
        }
            if(goals != null){
            ls.add(rbm.getGoals());
        }
          
         
        request.setAttribute("resumeList", ls);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ResumeResult.jsp");
        dispatcher.forward(request, response);
//
//         PrintWriter out = response.getWriter();
//         try{
//             
//             out.println("<html>");
//             out.println("<head>");
//             
//             out.println("<title>WHAT?</title>");
//             out.println("</head>");
//             out.println("<body>");
//             out.println("<p> yo yo yo yo yo yo </p>");
//             out.println("</body>");
//             out.println("</html>");
//             
//         } finally {
//             out.close();
//         }
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
