package Lab10_E20CSE422Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		Lab10_E20CSE422Function junit = new Lab10_E20CSE422Function();
		int result=junit.addNumbers(200,400);
		assertEquals(600,result);
	}

}
