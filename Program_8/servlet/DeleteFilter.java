package com.webproject.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class DeleteFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String action = req.getParameter("action");

        if ("INSERT".equals(action) || "UPDATE".equals(action)) {
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                request.setAttribute("errorMessage", "Invalid email format.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
                dispatcher.forward(request, response);
                return;
            }

            if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
                request.setAttribute("errorMessage", "Invalid password format.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }

        chain.doFilter(request, response);
    }

    public void destroy() {}
}