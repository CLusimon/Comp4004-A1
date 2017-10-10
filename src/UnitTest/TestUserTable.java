package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Server.Logic.Table.UserTable;

public class TestUserTable {

	
	@Test
	public void testConstructorPass() {
		assertNotNull(UserTable.getInstance());
	}

}
