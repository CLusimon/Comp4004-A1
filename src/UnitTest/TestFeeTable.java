package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import Server.Logic.Table.FeeTable;


public class TestFeeTable {

	@Test
	public void testConstructorPass() {
		assertNotNull(FeeTable.getInstance());
	}

}
