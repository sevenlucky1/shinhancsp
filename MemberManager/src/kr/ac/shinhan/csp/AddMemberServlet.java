package kr.ac.shinhan.csp;

import java.io.IOException; 

import javax.servlet.http.*; 
 
 
@SuppressWarnings("serial") 
public class AddMemberServlet extends HttpServlet { 
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException { 
	
		String name = req.getParameter("name"); 
		String number = req.getParameter("number"); 
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		String cacaotalk = req.getParameter("cacaotalk");
		String manager = req.getParameter("manager");
		String gitID = req.getParameter("gitID");
		
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/plain"); 
		
		Member m = MemberManager.addMember(name, number, phone, mail, cacaotalk, manager, gitID); 
		
		resp.getWriter().println("�̸� : "+m.getName()); 
		resp.getWriter().println("�й� : "+m.getNumber()); 
		resp.getWriter().println("��ȭ��ȣ : "+m.getPhone());
		resp.getWriter().println("email : "+m.getMail());
		resp.getWriter().println("īī���� : "+m.getCacaotalk());
		resp.getWriter().println("���� : "+m.getManager());
		resp.getWriter().println("GitID : "+m.getGitID()); 
	} 
} 