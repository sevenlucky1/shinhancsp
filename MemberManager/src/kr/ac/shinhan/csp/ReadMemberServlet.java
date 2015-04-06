package kr.ac.shinhan.csp;

import java.io.IOException; 
import java.util.List; 

import javax.servlet.http.*; 

public class ReadMemberServlet extends HttpServlet{ 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException { 
		String name = req.getParameter("name"); 
		String number = req.getParameter("number"); 
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		String cacaotalk = req.getParameter("cacaotalk");
		String manager = req.getParameter("manager");
		String gitId = req.getParameter("gitID");
		
		List<Member> namedMemberList = MemberManager.getMemberByName(name); 
		Member m = namedMemberList.get(0); 
		
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/plain");  
		
		resp.getWriter().println("�̸� : "+m.getName()); 
		resp.getWriter().println("�й� : "+m.getNumber()); 
		resp.getWriter().println("��ȭ��ȣ : "+m.getPhone()); 
		resp.getWriter().println("�����ּ� : "+m.getMail()); 
		resp.getWriter().println("īī���� ���̵� : "+m.getCacaotalk()); 
		resp.getWriter().println("���忩�� : "+m.getManager());
		resp.getWriter().println("GitID : "+m.getGitID()); 
		
		resp.getWriter().println("</body>"); 
		resp.getWriter().println("</html>"); 
	} 
} 