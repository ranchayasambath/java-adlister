import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
//public class HelloWorldServlet extends HttpServlet {
//
////    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
////        response.setContentType("text/html");
////        PrintWriter out = response.getWriter();
////        out.println("<h1>Hello, World!</h1>");
////    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        String outputResp = "<h1>Hello, World!</h1>";
//
//        if(request.getParameter("name") != null){
//            outputResp = "Hello, " + request.getParameter("name") +"!";
//        }
//        PrintWriter out = response.getWriter();
//        out.println(outputResp);
//    }
public class CounterServlet extends HttpServlet{
    public int counter=0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        counter++;

        response.getWriter().println("<h1> count currently is " + counter + " on this page load.</h1>" );
    }
}
