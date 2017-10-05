package UnitTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Server.Logic.Model.Loan;

public class TestLoan {
	Date date = new Date();
	Loan tester = new Loan (4,"1234567890123","3",date ,"4");
	Loan tester1;
	
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
		assertEquals(4, tester.getUserid());
	}
	@Test
	public void testGetUserIdfail() {
		assertNotEquals(000, tester.getUserid());
	}

	@Test
	public void testSetUserIdPass() {
		tester.setUserid(555);
		assertEquals(555, tester.getUserid());
	}
	@Test
	public void testSetUserIdFail() {
		tester.setUserid(30);
		assertNotEquals(4, tester.getUserid());
	}
	
	@Test
	public void testGetISBNPass() {
		assertEquals("1234567890123", tester.getIsbn());
	}
	@Test
	public void testGetISBNFail() {
		assertNotEquals("qwertyuiopasd", tester.getIsbn());
	}
	
	@Test
	public void testSetISBNPass() {
		tester.setIsbn("qwertyuiopasd");
		assertEquals("qwertyuiopasd", tester.getIsbn());
	}
	@Test
	public void testSetISBNFail() {
		tester.setIsbn("qwertyuiopasd");
		assertNotEquals("1234567890123", tester.getIsbn());
	}
	
	@Test
	public void testGetCopyNumberPass() {
		assertEquals("3", tester.getCopynumber());
	}
	@Test
	public void testGetCopyNumberFail() {
		assertNotEquals("2", tester.getCopynumber());
	}
	
	@Test
	public void testSetCopyNumberPass() {
		tester.setCopynumber("100");
		assertEquals("100", tester.getCopynumber());
	}
	@Test
	public void testSetCopyNumberFail() {
		tester.setCopynumber("100");
		assertNotEquals("3", tester.getCopynumber());
	}
}
