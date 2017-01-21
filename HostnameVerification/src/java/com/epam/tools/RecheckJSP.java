package com.epam.tools;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anton_Varanovich
 */

public class RecheckJSP extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/recheck.jsp").forward(request, response);
                
    }
            
}
