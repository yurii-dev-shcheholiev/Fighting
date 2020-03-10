package is;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForumTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		addTest();
		moveTest();
		
	}
	
	@Test
	public void addTest() {
		Fighter user1 = new Fighter(1, "Ibai");
		Fighter user2 = new Fighter(2, "Elmillor");
		World forum = new World("FansRM");
		
		forum.addAgent(user1, "Section 1");
		assertTrue(forum.contains(user1, 0));
		forum.addAgent(user2, "Section 2");
		assertTrue(forum.contains(user2, 1)); 
	}

	@Test
	public void moveTest() {
		Fighter user1 = new Fighter(1, "Ibai");
		Fighter user2 = new Fighter(2, "Elmillor");
		World forum = new World("FansRM");

		forum.addAgent(user1, "Section 1");
		
		forum.addAgent(user2, "Section 2");
		forum.moveAgent("Section 1", "Section 2" , 0);
		
		assertTrue(forum.contains(user1, 1));
		assertFalse(forum.contains(user1, 0));
		
		
	}
	
}
