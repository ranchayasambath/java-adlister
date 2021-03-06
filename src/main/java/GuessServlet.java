import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guessing.jsp").forward(request, response);
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        int guess = Integer.parseInt(request.getParameter("guess-input"));
        int random = (int) Math.floor(Math.random() * 3);
        if(guess== random){
            response.sendRedirect("/correct");
        }
        else if(guess<1 || guess > 3){
            response.sendRedirect("guess.jsp");
        }
        else{
            response.sendRedirect("/incorrect");
        }

    }
}
