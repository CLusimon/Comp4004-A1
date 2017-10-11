package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import Server.Logic.Table.UserTable;

public class TestUserTable {
	
	@Test
	public void testConstructorPass() {
		assertNotNull(UserTable.getInstance());
	}
	@Test
	public void testCreateUserPass(){
		assertEquals(true,UserTable.getInstance().createuser("000000000", "Testing"));
	}
	@Test
	public void testLookUpPass(){
		UserTable.getInstance().createuser("5", "password");
		assertTrue(UserTable.getInstance().lookup(0));
	}
	@Test
	public void testGetUserTablePass(){
		assertNotNull(UserTable.getInstance().getUserTable());
	}
	@Test
	public void testLookUpStringPass(){
		UserTable.getInstance().createuser("tester", "testington");
		UserTable.getInstance().createuser("tester1", "testington");
		assertEquals(7,UserTable.getInstance().lookup("tester"));
	}
	@Test
	public void testCheckUser(){
		UserTable.getInstance().createuser("tester", "pw");
		UserTable.getInstance().createuser("tester1", "pw1");
		assertEquals(1,UserTable.getInstance().checkUser("tester", "notpw")); //false pw	
		assertEquals(2,UserTable.getInstance().checkUser("notTester1", "pw1")); //false username
		assertEquals(0,UserTable.getInstance().checkUser("tester", "pw")); //correct info
	
	}
}
