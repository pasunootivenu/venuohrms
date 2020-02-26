package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("iam ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("13");
	}

	@Test
	public void test() {
		System.out.println("printing");
	
	}

}
