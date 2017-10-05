package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Model.User;

public class TestUser {
	User tester = new User (2, "michelle@carleton.ca","Michelle");
	User tester1;

	@Test
	public void testConstructorPass(){
		assertNotNull(tester); 
	}
	@Test
	public void testConstructorFail(){
		assertNull(tester1);
	}
	
	@Test
	public void testGetUserIdPass() {
		assertEquals(2, tester.getUserid());
	}
	@Test
	public void testGetUserItemIdFail() {
		assertNotEquals(1, tester.getUserid());
	}
	
	@Test
	public void testSetUserIdPass() {
		tester.setUserid(4);
		assertEquals(4, tester.getUserid());
	}
	@Test
	public void testSetUserIdFail() {
		tester.setUserid(4);
		assertNotEquals(2, tester.getUserid());
	}
	
	@Test
	public void testGetUsernamePass() {
		assertEquals("michelle@carleton.ca", tester.getUsername());
	}
	@Test
	public void testGetUsernameFail() {
		assertNotEquals("michelle", tester.getUsername());
	}
	
	@Test
	public void testSetUsernamePass() {
		tester.setUsername("clus@carleton.ca");
		assertEquals("clus@carleton.ca", tester.getUsername());
	}
	@Test
	public void testSetUsernameFail() {
		tester.setUsername("clus@carleton.ca");
		assertNotEquals("michelle@carleton.ca", tester.getUsername());
	}
	
	@Test
	public void testGetPasswordPass() {
		assertEquals("Michelle", tester.getPassword());
	}
	@Test
	public void testGetPasswordFail() {
		assertNotEquals("Clus", tester.getPassword());
	}
	
	@Test
	public void testSetPasswordPass() {
		tester.setPassword("Clus");
		assertEquals("Clus", tester.getPassword());
	}
	@Test
	public void testSetPasswordFail() {
		tester.setPassword("Clus");
		assertNotEquals("Michelle", tester.getPassword());
	}
}
