package com.ocr.filter;

import com.ocr.domain.Employee;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        String url = request1.getRequestURI();
        if(!url.contains("login") && !url.contains("doLogin")) {
            HttpSession session = ((HttpServletRequest) request).getSession();
            Employee employee = (Employee) session.getAttribute("currentUser");
            if (employee == null) {
                session.setAttribute("afterLoginUrl",url);
                response1.sendRedirect("/login/");
            } else {
                chain.doFilter(request, response);
            }
        }else
        {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
