package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import student.StudentHelper;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddVoteServlet", value = "/vote")
public class AddVoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName =  request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String major = request.getParameter("major");
        StudentHelper.vote(out,id,firstName,lastName,major);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
