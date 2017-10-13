package AcceptanceTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import client.LibClient;
import Server.Network.LibServer;
import Utilities.Config;

public class testAddTitle {
	private static LibServer server = new LibServer(Config.DEFAULT_PORT);
	@BeforeClass
	public static void beforeClass() {
	server.start();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testAddTitleExist() {
		LibClient user = new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
		server.handle(user.getID(), "Hello");
		server.handle(user.getID(), "Clerk");
		server.handle(user.getID(), "admin");
		server.handle(user.getID(), "Create Title");
		server.handle(user.getID(), "9781442668584,By the grace of God");
	}
	@Test
	public void testAddTitleDoesNotExist() {
		LibClient user1 = new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
		server.handle(user1.getID(), "Hello");
		server.handle(user1.getID(), "Clerk");
		server.handle(user1.getID(), "admin");
		server.handle(user1.getID(), "Create Title");
		server.handle(user1.getID(), "1234567890123,book");
	}
	@Test
	public void testAddTitleMissingInfo() {
		LibClient user2 = new LibClient(Config.DEFAULT_HOST, Config.DEFAULT_PORT);
		server.handle(user2.getID(), "Hello");
		server.handle(user2.getID(), "Clerk");
		server.handle(user2.getID(), "admin");
		server.handle(user2.getID(), "Create Title");
		server.handle(user2.getID(), "1234567890123,");
	}
}
