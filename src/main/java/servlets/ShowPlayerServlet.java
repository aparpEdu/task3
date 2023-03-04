package servlets;

import chess.ChessHelper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowPlayerServlet", value = "/players/view")
public class ShowPlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out  = response.getWriter();
        int fideID = Integer.parseInt(request.getParameter("fideID"));
        ChessHelper.showPlayer(out,fideID);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
