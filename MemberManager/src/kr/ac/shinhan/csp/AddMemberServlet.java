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
		
		resp.getWriter().println("이름 : "+m.getName()); 
		resp.getWriter().println("학번 : "+m.getNumber()); 
		resp.getWriter().println("전화번호 : "+m.getPhone());
		resp.getWriter().println("email : "+m.getMail());
		resp.getWriter().println("카카오톡 : "+m.getCacaotalk());
		resp.getWriter().println("팀장 : "+m.getManager());
		resp.getWriter().println("GitID : "+m.getGitID()); 
	} 
} 