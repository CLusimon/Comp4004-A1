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
}
