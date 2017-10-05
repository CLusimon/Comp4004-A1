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
	public void testUserIdPass() {
		assertEquals(2, tester.getUserid());
	}
	@Test
	public void testUserItemIdFail() {
		assertNotEquals(1, tester.getUserid());
	}
}
