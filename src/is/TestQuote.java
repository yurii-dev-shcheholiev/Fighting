package is;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuote {

	@Test
	public void test() {
		// fail("Not yet implemented");
		runTest();
		respondTest();
	}

	@Test
	public void runTest() {
		Fighter a1 = new Fighter(1, "Nelson");
		Fighter a2 = new Fighter(2, "Jerry");
		Fighting quote = new Fighting("Hi", "Hi guy, how are you?", "Fine", a1 ,a2);
		
		quote.run_quote();
		assertEquals(1, a2.getNrMessages());
		assertEquals(">Hi (User: " + a1.getName() + ")\n" + "Hi guy, how are you? (User: " + a2.getName() +")", a2.getMessage(a2.getNrMessages() - 1));
		assertEquals(1, a1.getNrNotifications());
		assertEquals(0, a2.getNrNotifications());
		
	}
	
	@Test
	public void respondTest() {

		Fighter a1 = new Fighter(1, "Nelson");
		Fighter a2 = new Fighter(2, "Jerry");
		Fighting quote = new Fighting("Hi", "Hi guy, how are you?", "Fine", a1 ,a2);
		
		quote.run_quote();
		
		quote.respond();
		assertEquals(0, a1.getNrNotifications());
		assertEquals(0, a2.getNrNotifications());
	}
}
