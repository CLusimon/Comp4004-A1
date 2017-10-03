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
}
