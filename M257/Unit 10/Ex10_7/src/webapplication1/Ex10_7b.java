/*
 * A servlet can run on a card...
 */
package webapplication1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author M257
 */
public class Ex10_7b extends HttpServlet {

    /**
     * Processes requests for <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html><head><title>Ex10_7b</title></head>");
            out.println("<body><h1>Ex10_7b</h1>");
            out.println("Hello from webapplication1.Ex10_7b to");
            out.println(request.getParameter("name"));
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
