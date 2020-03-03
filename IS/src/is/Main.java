package is;

public class Main {

	public static void printMessage(String final_message) {
		System.out.println(final_message);
	}
	
	public static void main(String args[]) {
		
		World world = new World("FansRM");
		
		System.out.println("INITIAL STATE: \n");
		Fighter fighter1 = new Fighter(1, "hugo0001", MartialArts.KARATE);
		Fighter fighter2 = new Fighter(2, "aldair0002", MartialArts.AIKIDO);
		world.addFighter(fighter1);
		world.addFighter(fighter2);
		
		System.out.println(world.stringify());
		
		System.out.println(world.stringify());
		fighter1.addTechnique(Techniques.PUNCH);
		fighter2.addTechnique(Techniques.KICK);
		
		System.out.println("---------------------------------------- \n");
		Fighting q = new Fighting(0, 0, fighter1, fighter2);
		
		q.run();
		System.out.println("---------------------------------------- \n");
		System.out.println("LAST STATE: \n");
		System.out.println(world.stringify());
		
		
	}
	
	
}
