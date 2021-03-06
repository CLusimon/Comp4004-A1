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
		tester.setUserid(99);
		assertNotEquals(100, tester.getUserid());
	}
	@Test
	public void testGetFeePass() {
		assertEquals(500, tester.getFee());
	}
	
	@Test
	public void testGetFeeFail() {
		assertNotEquals(501, tester.getFee());
	}
	@Test
	public void testSetFeePass() {
		tester.setFee(400);
		assertEquals(400, tester.getFee());
	}
	
	@Test
	public void testSetFeeFail() {
		tester.setFee(30);
		assertNotEquals(500, tester.getFee());
	}
	
	@Test
	public void testToStringPass() {
		assertEquals("["+tester.getUserid()+","+tester.getFee()+"]", tester.toString());
	}
	
	@Test
	public void testToStringFail() {
		assertNotEquals("Fail To String", tester.toString());
	}
}
