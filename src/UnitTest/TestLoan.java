package UnitTest;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import Server.Logic.Model.Loan;

public class TestLoan {
	Date date = new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime();
	Date date1 = new GregorianCalendar(2016, Calendar.FEBRUARY, 11).getTime(); 
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
	
	@Test
	public void testGetDatePass() {
		assertEquals(date, tester.getDate());
	}
	@Test
	public void testGetDateFail() {
		assertNotEquals(date1, tester.getDate());
	}
	
	@Test
	public void testSetDatePass() {
		tester.setDate(date1);
		assertEquals(date1, tester.getDate());
	}
	@Test
	public void testSetDateFail() {
		tester.setDate(date1);
		assertNotEquals(date, tester.getDate());
	}
	
	@Test
	public void testGetRenewstatePass() {
		assertEquals("4", tester.getRenewstate());
	}
	@Test
	public void testGetRenewstateFail() {
		assertNotEquals("2", tester.getRenewstate());
	}
	
	@Test
	public void testSetRenewstatePass() {
		tester.setRenewstate("5");
		assertEquals("5", tester.getRenewstate());
	}
	@Test
	public void testSetRenewstateFail() {
		tester.setRenewstate("5");
		assertNotEquals("4", tester.getRenewstate());
	}
}
