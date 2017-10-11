package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Table.ItemTable;

public class TestItemTable {

	@Test
	public void testConstructorPass() {
		assertNotNull(ItemTable.getInstance());
	}

}
