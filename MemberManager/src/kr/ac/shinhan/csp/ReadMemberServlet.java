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
		
		resp.getWriter().println("이름 : "+m.getName()); 
		resp.getWriter().println("학번 : "+m.getNumber()); 
		resp.getWriter().println("전화번호 : "+m.getPhone()); 
		resp.getWriter().println("메일주소 : "+m.getMail()); 
		resp.getWriter().println("카카오톡 아이디 : "+m.getCacaotalk()); 
		resp.getWriter().println("팀장여부 : "+m.getManager());
		resp.getWriter().println("GitID : "+m.getGitID()); 
		
		resp.getWriter().println("</body>"); 
		resp.getWriter().println("</html>"); 
	} 
} 