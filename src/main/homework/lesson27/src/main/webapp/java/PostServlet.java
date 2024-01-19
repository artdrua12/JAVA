package main.homework.lesson27.src.main.webapp.java;

import java.io.IOException;



public class PostServlet {
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
        String product = request.getParameter("product");
        String price = request.getParameter("price");
        if (!name.isEmpty() && !product.isEmpty() && price.isEmpty()) {
            // устанавливаем атрибуты
            request.setAttribute("name", name);
            request.setAttribute("product", product);
            request.setAttribute("price", price);
            // вызываем метод GET
            doGet(request, response);
        } else {
            // перенаправляем на страничку
            response.sendRedirect("views/wrong.jsp");
        }
    }
}
