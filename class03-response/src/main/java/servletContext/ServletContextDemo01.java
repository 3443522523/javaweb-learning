package servletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author HP
 * @description: TODO
 * @date 2024/9/28 16:36
 */
@WebServlet("/servletContextDemo01")
public class ServletContextDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    通过request 对象获取
        ServletContext servletContext01 = req.getServletContext();
//    通过this获取servletContext对象
        ServletContext servletContext02 = req.getServletContext();

        System.out.println(servletContext01.equals(servletContext02));
    }
}
