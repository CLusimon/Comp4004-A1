package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Table.TitleTable;

public class TestTitleTable {
	
	@Test
	public void testConstructorPass() {
		assertNotNull(TitleTable.getInstance());
	}

	@Test
	public void testCreateTitlePass(){
		assertEquals(true,TitleTable.getInstance().createtitle("000000000", "Testing"));
	}
	
	@Test
	public void testLookUpPass(){
		TitleTable.getInstance().createtitle("testISBN", "Testing");
		assertTrue(TitleTable.getInstance().lookup("testISBN"));
	}
	
	@Test
	public void testGetTitleTablePass(){
		assertNotNull(TitleTable.getInstance().getTitleTable());
	}
	@Test
	public void testDelete(){
		assertEquals("Active Loan Exists",TitleTable.getInstance().delete("9781442668584"));
		assertEquals("success",TitleTable.getInstance().delete("9781442616899"));
		assertEquals("The Title Does Not Exist",TitleTable.getInstance().delete("00000"));
	}

}
