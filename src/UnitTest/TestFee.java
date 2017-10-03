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
}
