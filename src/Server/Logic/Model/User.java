package Server.Logic.Model;

public class User {
	int userid;
	String username;
	String password;
	
	public User(int userid,String username,String password){
		this.userid=userid;
		this.password=password;
		this.username=username;
	}
	
	public int getUserid() {
		return userid;
	}
}