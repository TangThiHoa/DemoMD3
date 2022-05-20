import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Demo",urlPatterns = "/TTH59")  //
public class Demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String UserName = request.getParameter("User");
        String Password = request.getParameter("Pass");
        PrintWriter printWriter = response.getWriter();
        if (UserName.equals("Admin")&&(Password.equals(123))){
            printWriter.print("<html>"+"Hello Boss"+ "</html>");
        }else {
            printWriter.print("<html>"+"Nhập lại đê"+ "</html>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Bài tính tổng :
//        int x = Integer.parseInt(request.getParameter("a"));
//        int y = Integer.parseInt(request.getParameter("b"));
//        int sum = x - y ;
//        PrintWriter printWriter = response.getWriter();
//        printWriter.print("<html>"+sum+"</html>");


    }
}




