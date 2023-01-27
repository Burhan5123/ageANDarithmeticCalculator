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
        String operator = request.getParameter("operator");
        
        
        if ((firstString == null || firstString.equals("")) && (secondString == null || secondString.equals(""))){
            
            request.setAttribute("message", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            
        }
        try{
        int first = Integer.parseInt(firstString);
        int second = Integer.parseInt(secondString);
        int answer = 0;
        request.setAttribute("first", firstString);
        request.setAttribute("second", secondString);
        
        
        
        if(operator.equals("+")){
            answer = first + second;
        
        }
        if(operator.equals("-")){
            answer = first - second;
        
        }
        if(operator.equals("*")){
            answer = first * second;
        
        }
        if(operator.equals("%")){
            answer = first % second;
        
        }

        request.setAttribute("message", "Result: " + answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
        catch(Exception e){
            
        request.setAttribute("first", firstString);
        request.setAttribute("second", secondString);
        request.setAttribute("message", "Result: invalid");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
     
    }

}
