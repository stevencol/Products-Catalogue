package Controller;

import dao.persona.UserDao;
import dto.persona.Cliente;
import dto.persona.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        defatultActui(request, response);

    }

    private void defatultActui(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("home.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String eleccion = request.getParameter("action");

        if (eleccion.equals("resgister")) {
            registroUser(request, response);

        }

//      
    }

    private void registroUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre1 = request.getParameter("primerNombre");
        String nombre2 = request.getParameter("segundoNombre");
        String apellido1 = request.getParameter("primerApelldio");
        String apellido2 = request.getParameter("segundoApellido");
        String telefono = request.getParameter("telefono");
        String documento = request.getParameter("documento");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        Cliente p = new Cliente(nombre1, nombre2, apellido1, apellido2, telefono, correo, documento, null, null, contrasena, null);
        System.out.println(p);

        new UserDao().registerUser(p);
            System.out.println(request.getParameter("documento"));
        response.sendRedirect("home.jsp");

    }

}
