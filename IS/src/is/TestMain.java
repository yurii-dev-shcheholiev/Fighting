package is;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		// fail("Not yet implemented");
		addMessageTest();
		runTest();
		respondTest();
				
	}

	@Test
	public void addMessageTest() {
		Fighter user1 = new Fighter(1, "hugo0001");
		
		user1.addMessage("I think cats are the best animals");
		assertEquals("I think cats are the best animals", user1.getMessage(user1.getNrMessages() - 1));
		user1.changeName("hugo0003");
		assertEquals("Same name", "hugo0003", user1.getName());
	}
	
	@Test
	public void runTest() {
		String s = "";
		
		Fighter user1 = new Fighter(1, "hugo0001");
		Fighter user2 = new Fighter(2, "aldair0002");
		
		addMessageTest();
		
		user1.addMessage("I think cats are the best animals");
		assertEquals("I think cats are the best animals", user1.getMessage(user1.getNrMessages() - 1));
		user1.changeName("hugo0003");
		assertEquals("Same name", "hugo0003", user1.getName());
		
		Fighting q = new Fighting("cats are the best", "		Dogs are better tho", "I disagree", user1, user2);
		s = ">cats are the best (User: " + user1.getName() + ")\n" + "		Dogs are better tho (User: " + user2.getName() + ")";
		q.run_quote();

		assertEquals(s, user2.getMessage(user2.getNrMessages() - 1));
		assertEquals("I think cats are the best animals", user1.getMessage(user1.getNrMessages() - 1));
		assertEquals(1, user1.getNrMessages());
		assertEquals(1, user2.getNrMessages());
		
	}
	
	@Test
	public void respondTest() {
		String s = "";
		
		Fighter user1 = new Fighter(1, "hugo0001");
		Fighter user2 = new Fighter(2, "aldair0002");

		user1.addMessage("I think cats are the best animals");
		assertEquals("I think cats are the best animals", user1.getMessage(user1.getNrMessages() - 1));
		user1.changeName("hugo0003");
		assertEquals("Same name", "hugo0003", user1.getName());

		Fighting q = new Fighting("cats are the best", "		Dogs are better tho", "I disagree", user1, user2);
		s = ">cats are the best (User: " + user1.getName() + ")\n" + "		Dogs are better tho (User: " + user2.getName() + ")";
		q.run_quote();
		assertEquals(s, user2.getMessage(user2.getNrMessages() - 1));
		assertEquals("I think cats are the best animals", user1.getMessage(user1.getNrMessages() - 1));
		assertEquals(1, user1.getNrMessages());
		assertEquals(1, user2.getNrMessages());
		
		q.respond();
		assertEquals(s, user2.getMessage(user2.getNrMessages() - 1));
		assertEquals("I disagree", user1.getMessage(user1.getNrMessages() - 1));
		assertEquals(2, user1.getNrMessages());
		assertEquals(1, user2.getNrMessages());
	}
	

}
