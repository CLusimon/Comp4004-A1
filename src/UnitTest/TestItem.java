package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Model.Item;

public class TestItem {
	Item tester = new Item (2, "1234567890123", "3");
	Item tester1;
	
	@Test
	public void testConstructorPass(){
		assertNotNull(tester);
	}
	@Test
	public void testConstructorFail(){
		assertNull(tester1);
	}
	
	@Test
	public void testGetItemIdPass() {
		assertEquals(2, tester.getItemid());
	}
	@Test
	public void testGetItemIdFail() {
		assertNotEquals(1, tester.getItemid());
	}
	
	@Test
	public void testSetItemIdPass() {
		tester.setItemid(4);
		assertEquals(4, tester.getItemid());
	}
	@Test
	public void testSetItemIdFail() {
		tester.setItemid(4);
		assertNotEquals(2, tester.getItemid());
	}
	
	@Test
	public void testGetISBNPass() {
		assertEquals("1234567890123", tester.getISBN());
	}
	@Test
	public void testGetISBNFail() {
		assertNotEquals("qwertyuiopasd", tester.getISBN());
	}
	
	@Test
	public void testSetISBNPass() {
		tester.setISBN("qwertyuiopasd");
		assertEquals("qwertyuiopasd", tester.getISBN());
	}
	@Test
	public void testSetISBNFail() {
		tester.setISBN("qwertyuiopasd");
		assertNotEquals("1234567890123", tester.getISBN());
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
	public void testToStringPass() {
		assertEquals("["+tester.getItemid()+","+tester.getISBN()+","+tester.getCopynumber()+"]", tester.toString());
	}
	@Test
	public void testToStringFail() {
		assertNotEquals("Fail ToString", tester.toString());
	}
}
