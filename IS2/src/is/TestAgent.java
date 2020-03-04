package is;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAgent {

	@Test
	public void test() {
		//fail("Not yet implemented");
		addTest();
		changeNameTest();
		banTest();
	}
	
	@Test
	public void addTest() {
		Fighter user1 = new Fighter(1, "Ibai");
		Fighter user2 = new Fighter(2, "Elmillor");
		
		user1.addMessage("Hello");
		assertEquals("Length of the array of messages", 1, user1.getNrMessages());
		user2.addMessage("Hello" + user1.getName());
		assertEquals("Length of the array of messages", 1, user2.getNrMessages());
		
		assertEquals("Same message", "Hello", user1.getMessage(user1.getNrMessages() - 1));
		assertEquals("Same message", "Hello" + user1.getName(), user2.getMessage(user2.getNrMessages() - 1));
		
		
		user1.addMessage("Very good. Thank you");
		assertEquals("Length of the array of messages", 2, user1.getNrMessages());
		user1.deleteMessage(0);
		assertEquals("Length of the array of messages", 1, user1.getNrMessages());
		assertEquals("Same message", "Very good. Thank you", user1.getMessage(user1.getNrMessages() - 1));
		
	}

	@Test
	public void changeNameTest() {
		Fighter user1 = new Fighter(1, "Ibai", MartialArts.AIKIDO);
		Fighter user2 = new Fighter(2, "Elmillor", MartialArts.JUIJUTSU);
		
		user1.setName("Gero");
		assertEquals("Same name", "Gero", user1.getName());
		user1.setName("Robert");
		assertEquals("Same name", "Robert", user1.getName());
		user2.setName("Cristian");
		assertEquals("Same name", "Cristian", user2.getName());
		
	}
	
	@Test
	public void banTest() {
		Fighter user2 = new Fighter(2, "Elmillor", MartialArts.KARATE);
		
		assertFalse(user2.getKO());
		user2.setKO(true);
		assertTrue(user2.getKO());
		
	}
	
}
