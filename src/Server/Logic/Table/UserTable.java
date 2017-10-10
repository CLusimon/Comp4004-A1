package Server.Logic.Table;


import java.util.ArrayList;
import java.util.List;


//import org.apache.log4j.Logger;

import Server.Logic.Model.User;

//import utilities.Trace;

public class UserTable {
	//private Logger logger = Trace.getInstance().getLogger("opreation_file");
	List<User> userList=new ArrayList<User>();
    private static class UserListHolder {
        private static final UserTable INSTANCE = new UserTable();
    }
    private UserTable(){
    	//set up the default list with some instances
    	String[] passwordList=new String[]{"Zhibo","Yu","Michelle","Kevin","Sun"};
    	String[] usernameList=new String[]{"Zhibo@carleton.ca","Yu@carleton.ca","Michelle@carleton.ca","Kevin@carleton.ca","Sun@carleton.ca"};
    	for(int i=0;i<usernameList.length;i++){
			User deuser=new User(i,usernameList[i],passwordList[i]);
			userList.add(deuser);
		}
    	//logger.info(String.format("Operation:Initialize UserTable;UserTable: %s", userList));
    };
    public static final UserTable getInstance() {
        return UserListHolder.INSTANCE;
    }
	public Object createuser(String string, String string2) {		
		boolean result=true;
		int flag=0;
		for(int i=0;i<userList.size();i++){
			String email=(userList.get(i)).getUsername();
			if(email.equalsIgnoreCase(string)){
				flag=flag+1;
			}else{
				flag=flag+0;	
			}
		}
		if(flag==0){
			User newuser=new User(userList.size(),string,string2);
			result=userList.add(newuser);
			//logger.info(String.format("Operation:Create New User;User Info:[%s,%s];State:Success", string,string2));
		}else{
			result=false;
			//logger.info(String.format("Operation:Create New User;User Info:[%s,%s];State:Fail;Reason:The User already existed.", string,string2));
		}
		return result;	
	}
	public boolean lookup(int j) {
		boolean result=true;
		int flag=0;
		for(int i=0;i<userList.size();i++){
			int userid=(userList.get(i)).getUserid();
			if(userid==j){
				flag=flag+1;
			}else{
				flag=flag+0;	
			}
		}
		if(flag==0){
			result=false;
		}
		return result;
	}
}
