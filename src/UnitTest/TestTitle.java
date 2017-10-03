package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Model.Title;

public class TestTitle {
	Title tester = new Title ("12345678910111", "Alchemist");
	Title tester1;
	
	@Test
	public void testConstructorPass() {
		assertNotNull(tester);
	}
	
	@Test
	public void testConstructorFail() {
		assertNull(tester1);
	}
	
	@Test
	public void testGetISBNPass() {
		assertEquals("12345678910111", tester.getISBN());
	}
	
	@Test
	public void testGetISBNFail() {
		assertNotEquals("1", tester.getISBN());
	}
	
	@Test
	public void testSetISBNPass() {
		tester.setISBN("qwertyuiopasd");
		assertEquals("qwertyuiopasd", tester.getISBN());
	}
	
	@Test
	public void testSetISBNFail() {
		tester.setISBN("qwertyuiopasd");
		assertNotEquals("12345678910111", tester.getISBN());
	}
	
	@Test
	public void testGetBookTitlePass() {
		assertEquals("Alchemist", tester.getBooktitle());
	}
	
	@Test
	public void testGetBookTitleFail() {
		assertNotEquals("Not Alchemist", tester.getBooktitle());
	}
	
	@Test
	public void testSetBookTitlePass() {
		tester.setBooktitle("New Alchemist");
		assertEquals("New Alchemist", tester.getBooktitle());
	}
	
	@Test
	public void testSetBookTitleFail() {
		tester.setBooktitle("New Alchemist");
		assertNotEquals("Alchemist", tester.getBooktitle());
	}
	
	@Test
	public void testToStringPass() {
		assertEquals("["+tester.getISBN()+","+tester.getBooktitle()+"]", tester.toString());
	}
	
	@Test
	public void testToStringFail() {
		assertNotEquals("Fail ToString", tester.toString());
	}
	
}
