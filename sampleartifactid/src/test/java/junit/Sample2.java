package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample2 {

	@Before
	public void setUp() throws Exception {
		System.out.println("12");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("1234");
	}

	@Test
	public void test() {
		System.out.println("123");
		
	}

}
