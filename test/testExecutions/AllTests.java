package testExecutions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAlien.class, TestEnvironment.class, TestHuman.class, TestInputHandler.class,
		TestSharedActions.class, TestUpgradeHandler.class })
public class AllTests {
	
}
