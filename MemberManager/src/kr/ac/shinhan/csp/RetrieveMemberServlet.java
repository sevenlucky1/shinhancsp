package kr.ac.shinhan.csp;

import java.io.IOException; 
import java.util.List; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

public class RetrieveMemberServlet extends HttpServlet{ 
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{ 
	
		List<Member> memberList = MemberManager.getAllMembers(); 
		
		resp.getWriter().println("<HTML>"); 
		resp.getWriter().println("<body>"); 
		resp.getWriter().println("<table border = 1>"); 
		
		for(Member m :memberList) 
		{ 
			resp.getWriter().println("<tr>"); 
			resp.getWriter().println("<td>"+"<a href = '/ReadMemberServlet?name="
			+m.getName()+"'>"+m.getName()+"</a>"+"</td><td>"+m.getNumber()+"</a>"+"</td><td>"+m.getPhone()+"</a>"+"</td><td>"+m.getMail()+
			"</a>"+"</td><td>"+m.getCacaotalk()+"</a>"+"</td><td>"+m.getManager()+"</a>"+"</td><td>"+m.getGitID()+"</td>"); 
			resp.getWriter().println("</tr>"); 
		} 
		
		resp.getWriter().println("</table>"); 
		resp.getWriter().println("</body>"); 
		resp.getWriter().println("</HTML>"); 
		
	} 
} 