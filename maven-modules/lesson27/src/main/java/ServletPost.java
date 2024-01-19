
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // перенаправляем на страничку
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/corect.jsp");
        // передаем параметры
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String order = request.getParameter("order");
        String price = request.getParameter("price");
        if (name.isEmpty() || order.isEmpty() || price.isEmpty()) {
            // перенаправляем на страничку
            response.sendRedirect("index.html");
        } else {
            // устанавливаем атрибуты
            request.setAttribute("name", name);
            request.setAttribute("order", order);
            request.setAttribute("price", price);
            // вызываем метод GET
            doGet(request, response);
        }
    }
}
