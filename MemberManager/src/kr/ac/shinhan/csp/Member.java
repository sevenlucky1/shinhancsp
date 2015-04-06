package kr.ac.shinhan.csp;

import javax.jdo.annotations.IdGeneratorStrategy; 
import javax.jdo.annotations.IdentityType; 
import javax.jdo.annotations.PersistenceCapable; 
import javax.jdo.annotations.Persistent; 
import javax.jdo.annotations.PrimaryKey; 
 
 
@PersistenceCapable(identityType = IdentityType.APPLICATION) 
public class Member { 
	@PrimaryKey 
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Long id; 
	
	@Persistent 
	private String name; 
	
	@Persistent 
	private String number; 
	
	@Persistent
	private String phone;
	
	@Persistent
	private String mail;
	
	@Persistent
	private String cacaotalk;
	
	@Persistent
	private String manager;
	
	@Persistent
	private String gitID;
	
	public Member(String name, String number, String phone, String mail, String cacaotalk, String manager, String gitID) { 
		super(); 
		this.name = name; 
		this.number = number; 
		this.phone = phone;
		this.mail = mail;
		this.cacaotalk = cacaotalk;
		this.manager = manager;
		this.gitID = gitID;
	} 
	
	public String getName() { 
		return name; 
	} 
	 
	public void setName(String name) { 
		this.name = name; 
	} 
	
	public String getNumber() { 
		return number; 
	} 
	
	public void setNumber(String number) { 
		this.number = number; 
	} 
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCacaotalk() {
		return cacaotalk;
	}

	public void setCacaotalk(String cacaotalk) {
		this.cacaotalk = cacaotalk;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getGitID() {
		return gitID;
	}

	public void setGitId(String gitID) {
		this.gitID = gitID;
	}
	
	public Long getId() { 
		return id; 
	} 
} 