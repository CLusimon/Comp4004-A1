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
	public void testSetItemIdNPass() {
		tester.setItemid(4);
		assertEquals(4, tester.getItemid());
	}
	@Test
	public void testSetItemIdFail() {
		tester.setItemid(4);
		assertNotEquals(2, tester.getItemid());
	}
	
}
