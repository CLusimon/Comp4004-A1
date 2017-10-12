package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import Server.Logic.Table.FeeTable;


public class TestFeeTable {

	@Test
	public void testConstructorPass() {
		assertNotNull(FeeTable.getInstance());
	}
	@Test
	public void testLookUpPass(){
		assertEquals(true,FeeTable.getInstance().lookup(0));
	}
	@Test
	public void testLookUpFeePass(){
		assertEquals(0,FeeTable.getInstance().lookupfee(0));
	}
	@Test
	public void testApplyFeePass(){
		FeeTable.getInstance().applyfee(0, 789465123);
		assertNotEquals(5,FeeTable.getInstance().lookupfee(0));
	}
	@Test
	public void testGetFeeTablePass(){
		assertNotNull(FeeTable.getInstance().getFeeTable());
	}
	@Test
	public void testPayFine(){
		assertEquals("Borrowing Items Exist",FeeTable.getInstance().payfine(0));
		assertEquals("success",FeeTable.getInstance().payfine(1));
	}
}
