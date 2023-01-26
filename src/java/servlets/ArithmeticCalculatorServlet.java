package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author burha
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String addition = request.getParameter("+");
        String subtraction = request.getParameter("-");
        String multiplication = request.getParameter("*");
        String division = request.getParameter("%");
        
        if (firstString == null || firstString.equals("") || secondString == null || secondString.equals("")){
            
            request.setAttribute("message", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            
        }
        
        int first = Integer.parseInt(firstString);
        int second = Integer.parseInt(secondString);
        double answer = 0;
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        
        if(addition.equals("+")){
            answer = first + second;
        
        }
        if(subtraction.equals("-")){
            answer = first - second;
        
        }
        if(multiplication.equals("*")){
            answer = first * second;
        
        }
        if(division.equals("%")){
            answer = first / second;
        
        }
        
     
    }

}
