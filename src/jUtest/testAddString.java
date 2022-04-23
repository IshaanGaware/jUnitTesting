package Lab10_E20CSE422Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		Lab10_E20CSE422Function junitsting = new Lab10_E20CSE422Function();
		String result=junitsting.addString("Hello"," World");
		assertEquals("Hello World",result);
	}

}
