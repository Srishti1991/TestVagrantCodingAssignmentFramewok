package com.testvagrant.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import com.testvagrant.testobject.TestObject;

public class TestCases extends TestObject {
	Assertion hardassert = new Assertion();

	@Test(priority = 1)
	public void getCountOfForeignPlayersCount() {
		TestObject.getForeignPlayer();
		hardassert.assertEquals(4, count, "There is more then four or less the four foreign player exists in Team");
	}

	@Test(priority = 2)
	public void getCountOfWicketKeeperPlayers() {
		TestObject.getWicketKeepersInTeam();
		hardassert.assertEquals(1, count, "There is more then one or none wicket keeper exists in Team");

	}

}
