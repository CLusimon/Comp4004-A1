package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Table.ItemTable;
import Server.Logic.Table.TitleTable;

public class TestItemTable {

	@Test
	public void testConstructorPass() {
		assertNotNull(ItemTable.getInstance());
	}
	@Test
	public void testCreateItemPass(){
		TitleTable.getInstance().createtitle("testISBN", "Testing");
		assertEquals(true,ItemTable.getInstance().createitem("testISBN"));
	}
}
