package UnitTest;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import Server.Logic.Table.LoanTable;

public class TestLoanTable {
	@Test
	public void testConstructorPass() {
		assertNotNull(LoanTable.getInstance());
	}
	@Test
	public void testCreateLoan(){
		Date date = new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime();
		assertEquals("User Invalid",LoanTable.getInstance().createloan(-5, "9781442668584", "1",date));
		assertEquals("ISBN Invalid",LoanTable.getInstance().createloan(0, "9781442", "1",date));
		assertEquals("Copynumber Invalid",LoanTable.getInstance().createloan(0, "9781442668584", "25",date));
		assertEquals("Outstanding Fee Exists",LoanTable.getInstance().createloan(0, "9781442668584", "1",date));
	}
	@Test
	public void testLookUp(){
		assertEquals(true,LoanTable.getInstance().lookup(0, "9781442668584", "1"));
	}
	@Test
	public void testCheckLimit(){
		assertEquals(true,LoanTable.getInstance().checkLimit(1));
	}
	@Test
	public void testRenewal(){
		Date date = new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime();
		assertEquals("The loan does not exist",LoanTable.getInstance().renewal(1, "9781442668584", "1", date));
		assertEquals("Outstanding Fee Exists",LoanTable.getInstance().renewal(0, "9781442668584", "1", date));
	}
	@Test
	public void testReturnItem(){
		Date date = new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime();
		assertEquals("The Loan Does Not Exist",LoanTable.getInstance().returnItem(1, "9781442668584", "1", date));
		assertEquals("success",LoanTable.getInstance().returnItem(0, "9781442668584", "1", date));
	}
	@Test
	public void testLookLimit(){
		assertEquals(true,LoanTable.getInstance().looklimit(0));
	}
}
