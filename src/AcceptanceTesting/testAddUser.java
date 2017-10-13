package AcceptanceTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import client.LibClient;
import Server.Network.LibServer;
import Utilities.Config;

public class testAddUser {
	private static LibServer server = new LibServer(Config.DEFAULT_PORT);
	@BeforeClass
	public static void beforeClass() {
	server.start();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testAddUserExist() {
		LibClient user = new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
		server.handle(user.getID(), "Hello");
		server.handle(user.getID(), "Clerk");
		server.handle(user.getID(), "admin");
		server.handle(user.getID(), "Create User");
		server.handle(user.getID(), "Zhibo@carleton.ca, Zhibo");
	}
	@Test
	public void testAddUserDoesNotExist() {
		LibClient user1 = new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
		server.handle(user1.getID(), "Hello");
		server.handle(user1.getID(), "Clerk");
		server.handle(user1.getID(), "admin");
		server.handle(user1.getID(), "Create User");
		server.handle(user1.getID(), "clusngo@gmail.com,Clus");
	}
}
