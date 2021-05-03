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

		boolean try1 = EmailChecker.EmailChecker1("Wdsfjsn'@?.!scsd");
		assertEquals(try1 == true, true);
	}
	@Test
	public void test2()
	{
		boolean try2 = EmailChecker.EmailChecker1("akesdfs");
		assertEquals(try2 == false, true);

	}
	@Test
	public void test3()
	{
		boolean try3 = EmailChecker.EmailChecker1("michael__galvan1358@gmail.com");
		assertEquals(try3 == true, true);

	}
	@Test
	public void test4()
	{
		boolean try4 = EmailChecker.EmailChecker1("michaelgalvan@gmail.com");
		assertEquals(try4 == false, true);
	}

}
