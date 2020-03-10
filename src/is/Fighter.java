package is;

import java.util.ArrayList;
import java.util.List;

public class Fighter {

	public static final int SIZE = 100;
	private int id;
	private String name;
	private MartialArts style;
	private List<Techniques> techniques;
	private int numTechniques;
	private double power;
	private int speed;
	private int reflexes;
	private int stamina;
	private int reach;
	private int health;
	private int conciousness;
	
	private int experience;
	private int money;
	
	private boolean KO;
	
	public Fighter(int userId, String name, MartialArts style) {
		try{
			if(name.length() == 0) {
				throw new IllegalArgumentException("Not user name inserted");
			}
			else {
				this.name = name;
			}
			if(userId < 1) {
				throw new IllegalArgumentException("Negative user ID");
			}
			else {
				id = userId;
			}
			this.style = style;
			power = 0.5;
			techniques = new ArrayList<>();
			stamina = 100;
			reflexes = 0;
			numTechniques = 0;
			KO = false;
			health = 100;
			money = 0;
			experience = 0;
			conciousness = 100;
			speed = 100;
		}
		catch(IllegalArgumentException iae) {
			System.err.println(iae.getMessage());
		}
	}
	
	public void addTechnique(Techniques tech) {
		techniques.add(tech);
		numTechniques++;
	}
	
	
	public void removeTechnique(int i) {
		techniques.remove(i);
		numTechniques--;
	}
	
	public int getId() {
		return id;
	}
	
	public void setExperience(int experience) {
		this.experience += experience;
	}
	
	public void setMoney(int money) {
		this.money += money;
	}
	
	public void setStamina(int stamina) {
		if(this.stamina - stamina < 0) {
			this.stamina = 0;
		}
		else {
			this.stamina-= stamina;
		}
	}
	
	public int getStamina() {
		return this.stamina;
	}
	
	public Techniques getTechnique(int i) {
		return this.techniques.get(i);
	}
	
	public int getNrTechniques() {
		return this.numTechniques;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(this.health - health < 0) {
			this.health = 0;
		}
		else {
			this.health-= health;
		}
	}

	public int getConsciousness() {
		return conciousness;
	}

	public void setConsciousness(int consciousness) {
		this.conciousness = consciousness;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKO(boolean kO) {
		KO = kO;
	}

	public boolean getKO() {
		return this.KO;
	}
	
	public String stringify() {
		String s = "ID: " + id + "\n" +
					"Name: " + name + "\n" +
					"Style: " + style.name() + "\n" +
					"Health: " + health + "\n" +
					"Stamina: " + stamina + "\n" +
					"Money: " + money + "\n" +
					"Experience: " + experience + "\n" +
					"Number of techniques: " + numTechniques + "\n" +
					"Techniques: \n"; 
		if(numTechniques == 0) {
			s += "NONE \n";
		}
		else {
			for (int i = 0; i < numTechniques; i++) {
				s += "- " + techniques.get(i) + "\n";
			}
		}
		s += "Knocked out: " + KO + " \n";
		return s;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	
}
