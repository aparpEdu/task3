package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import tasks.TaskHelper;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowAllTasksServlet", value = "/tasks")
public class ShowAllTasksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        TaskHelper.showAllTasks(out);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
