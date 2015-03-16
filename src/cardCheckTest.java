import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;


public class cardCheckTest {
	//7009554261183250
	/*@Test
	public void testcheck1() {
		assertEquals("invalid", "This credit card is invalid.", cardCheck.check());
	}
	*/
	//6178459783731046
	@Test
	public void testcheck2() {
	assertEquals("valid", "This credit card is valid.", cardCheck.check());
	}
}
	
