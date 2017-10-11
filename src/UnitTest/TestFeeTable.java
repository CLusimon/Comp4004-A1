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
	public void testLookUpFee(){
		assertEquals(5,FeeTable.getInstance().lookupfee(0));
	}

}
