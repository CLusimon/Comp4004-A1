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
		assertEquals(false,FeeTable.getInstance().lookup(0));
	}
	@Test
	public void testLookUpFeePass(){
		assertEquals(5,FeeTable.getInstance().lookupfee(0));
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
}
