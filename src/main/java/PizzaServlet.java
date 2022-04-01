import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pizza.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("size");
        String address = request.getParameter("address");
        String[] toppings = request.getParameterValues("toppings");

        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("size: "+ size);
        System.out.println("Toppings: " + Arrays.toString(toppings));
        System.out.println("Address: "+ address);
        response.sendRedirect("pizza.jsp");
    }
}

