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

}
