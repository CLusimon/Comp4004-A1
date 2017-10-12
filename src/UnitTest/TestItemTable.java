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
	@Test
	public void testLookUpPass(){
		assertEquals(true,ItemTable.getInstance().lookup("9781442668584", "1"));
	}
	@Test
	public void testDeleteAllPass(){
		ItemTable.getInstance().deleteAll("9781442616899");
		assertEquals(false,ItemTable.getInstance().lookup("9781442616899", "1"));
	}
	@Test
	public void testGetItemTablePass(){
		assertNotNull(ItemTable.getInstance().getItemTable());
	}
	@Test
	public void testDelete(){
		assertEquals("Active Loan Exists",ItemTable.getInstance().delete("9781442668584", "1"));
		assertEquals("success",ItemTable.getInstance().delete("9781611687910", "1"));
		assertEquals("The Item Does Not Exist",ItemTable.getInstance().delete("9781442616899", "1"));
		
	}
}
