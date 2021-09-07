package Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] string = {"호랑이","사자","코끼리"};
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<table>");
		writer.println("<th>삭제</th>");
		writer.println("<th>수정</th>");
		
		for(int i=0; i<string.length; i++) {
			
			writer.println("<tr>");
			writer.println("<td>" + string[i] +"</td>");
			writer.println("<td><a href = 'delete?id=" +string[i] + "'>삭제</a></td>");
			writer.println("<td><a href = 'update?id=" +string[i] + "'>수정</a></td>");
			writer.println("</tr>");
			
		}
		writer.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
