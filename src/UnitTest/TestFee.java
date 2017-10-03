package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Model.Fee;

public class TestFee {
	Fee tester = new Fee (2,500);
	Fee tester1;
			
	@Test
	public void testConstructorPass() {
		assertNotNull(tester);
	}
			
	@Test
	public void testConstructorFail() {
		assertNull(tester1);
	}
	
	@Test
	public void testGetUserIdPass() {
		assertEquals(2, tester.getUserid());
	}
	
	@Test
	public void testGetUserIdFail() {
		assertNotEquals(222, tester.getUserid());
	}
	
	@Test
	public void testSetUserIdPass() {
		tester.setUserid(1012);
		assertEquals(1012, tester.getUserid());
	}
	
	@Test
	public void testSetUserIdFail() {
		tester.setUserid(100);
		assertNotEquals(90, tester.getUserid());
	}
}
