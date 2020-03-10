package is;

import java.util.Random;

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
			if(enoughStamina(fighter1, tech1)) {
				Random r = new Random(100);
				if(r.nextInt() < tech1.getAccuracy()) {
					fighter2.setHealth((int) Math.round(tech1.getDamage() * fighter1.getPower()));
					fighter1.setStamina(tech1.getStamina());
				}
			}
		}
		else {
			if(enoughStamina(fighter2, tech2)) {
				Random r = new Random(100);
				if(r.nextInt() < tech2.getAccuracy()) {
					fighter1.setHealth((int) Math.round(tech2.getDamage() * fighter2.getPower()));
					fighter2.setStamina(tech1.getStamina());
				}
			}
		}
		
		if(fighter1.getHealth() <= 0) {
			fighter1.setKO(true);
		}
		else if (fighter2.getHealth() <= 0) {
			fighter2.setKO(true);
		}
		
	}
	
	private boolean enoughStamina(Fighter fighter, Techniques tech) {
		return fighter.getStamina() > tech.getStamina();
	}
	
}
