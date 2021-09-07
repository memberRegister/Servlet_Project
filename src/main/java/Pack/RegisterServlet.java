package com.example.web03;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/insert")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InsertServlet doGet");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("InsertServlet doPost");
        request.setCharacterEncoding("euc-kr");
        String id = request.getParameter("id");

        response.setContentType("text/html;charset=euc-kr");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("</head>");
        pw.println("<body>");
        if(id==null || id == "")
            pw.println("올바르지 않은 id입니다!<br>");
        else {
            pw.println(id + "님 성공적으로 가입이 되었습니다!<br>");
            ListServlet.memberList.add(id);
        }
        pw.println("		<a href='insert.html'>돌아가기</a>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
