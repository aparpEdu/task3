package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import tasks.TaskHelper;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowTaskServlet", value = "/tasks/view")
public class ShowTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();
       int id = Integer.parseInt(request.getParameter("id"));
        TaskHelper.showTask(id,out);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
