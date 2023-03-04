package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import tasks.Task;
import tasks.TaskHelper;
import tasks.TaskList;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AddServlet", value = "/tasks/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title  = request.getParameter("title");
        String desc = request.getParameter("desc");
        String endDate = request.getParameter("end");
       TaskHelper.addToList(desc,endDate,id,title);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
