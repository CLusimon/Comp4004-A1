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
		assertEquals("The Item is Not Available",LoanTable.getInstance().createloan(0, "9781442668584", "1",date));
	}
}
