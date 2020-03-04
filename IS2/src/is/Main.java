package is;

public class Main {

	public static void printMessage(String final_message) {
		System.out.println(final_message);
	}
	
	public static void main(String args[]) {
		
		World world = new World("WarZone");
		
		System.out.println("INITIAL STATE: \n");
		Fighter fighter1 = new Fighter(1, "hugo0001", MartialArts.KARATE);
		Fighter fighter2 = new Fighter(2, "aldair0002", MartialArts.AIKIDO);
		world.addFighter(fighter1);
		world.addFighter(fighter2);
		
		System.out.println(world.stringify());
	
		fighter1.addTechnique(Techniques.PUNCH);
		fighter2.addTechnique(Techniques.KICK);
		
		System.out.println("---------------------------------------- \n");
		System.out.println("New FIGHT \n");
		
		Fighting fight = new Fighting(0, 0, fighter1, fighter2);
		int num = 0;
		while(!fighter1.getKO() && !fighter2.getKO()) {	
			fight.run();
			num++;
		}
		Fighter winner = null;
		if(fighter1.getKO()) {
			winner = fighter2;
		}
		else {
			winner = fighter1;
		}
		winner.setExperience(500);
		winner.setMoney(1000);
		
		System.out.println("Number of cycles: " + num);
		System.out.println(world.stringify());
		System.out.println("Winner: " + winner.getName());
		System.out.println("---------------------------------------- \n");
		System.out.println("LAST STATE: \n");
		System.out.println(world.stringify());
		
		
	}
	
	
}
