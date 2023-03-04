package servlets;

import chess.ChessHelper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistrationServlet", value = "/players/add")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int fideID = Integer.parseInt(request.getParameter("fideID"));
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        int elo = Integer.parseInt(request.getParameter("elo"));
        ChessHelper.registerPlayer(out,fideID,name,lastName,elo);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
