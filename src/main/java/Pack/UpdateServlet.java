package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public UpdateServlet() {
      super();
      System.out.println("������ ��");
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
		response.setContentType("text/HTML; charset=UTF-8"); // �ѱۼ���
		PrintWriter out = response.getWriter(); // html ��ü�� ���� �� �ִ� ��ü�� ����
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			
			out.println("<body>");
				out.println("<h1>" + id + " ������" +"</h1>");
			out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
