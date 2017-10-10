package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Table.TitleTable;
import Server.Logic.Table.UserTable;

public class TestUserTable {
	
	@Test
	public void testConstructorPass() {
		assertNotNull(UserTable.getInstance());
	}
	@Test
	public void testCreateUserPass(){
		assertEquals(true,UserTable.getInstance().createuser("000000000", "Testing"));
	}
	@Test
	public void testLookUpPass(){
		UserTable.getInstance().createuser("5", "password");
		assertTrue(UserTable.getInstance().lookup(0));
	}
	@Test
	public void testGetUserTablePass(){
		assertNotNull(UserTable.getInstance().getUserTable());
	}

}
