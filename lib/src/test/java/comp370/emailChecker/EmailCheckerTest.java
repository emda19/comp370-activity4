package comp370.emailChecker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailCheckerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//Testing build for passed test
		int one = 1;
		int two = 2;
		assertEquals(one, 1);
		assertNotEquals(one, 2);
		assertEquals(two, 2);
		assertNotEquals(two, 1);
	}

}
