package UnitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Server.Logic.Table.LoanTable;

public class TestLoanTable {
	@Test
	public void testConstructorPass() {
		assertNotNull(LoanTable.getInstance());
	}
}
