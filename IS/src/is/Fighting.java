package is;

public class Fighting {
	private Fighter fighter1;
	private Fighter fighter2;
	private int action1;
	private int action2;	
	public Fighting(int a1, int a2, Fighter i1, Fighter i2) {
		action1 = a1;
		action2 = a2;
		fighter1 = i1;
		fighter2 = i2;
	}
	
	public void run() {
		Techniques tech1 = fighter1.getTechnique(action1);
		Techniques tech2 = fighter2.getTechnique(action2);
		if (fighter1.getSpeed() * tech1.getSpeed() > fighter2.getSpeed() * tech2.getSpeed()) {
			fighter2.setHealth(fighter2.getHealth() - tech1.getDamage());
		}
		else {
			fighter1.setHealth(fighter1.getHealth() - tech2.getDamage());
		}
	}
	
}
