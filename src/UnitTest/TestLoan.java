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

}
