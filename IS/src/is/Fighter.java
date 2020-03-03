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
	private int power;
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
			techniques = new ArrayList<>();
			stamina = 100;
			reflexes = 0;
			numTechniques = 0;
			KO = false;
			health = 100;
			money = 0;
			experience = 0;
			conciousness = 100;
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
	
	public void KO() {
		KO = true;
	}
	
	public int getId() {
		return id;
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
		this.health = health;
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
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public String stringify() {
		String s = "ID: " + id + "\n" +
					"Name: " + name + "\n" +
					"Style: " + style.name() + "\n" +
					"Health: " + this.health + "\n" +
					"Stamina: " + this.stamina + "\n" +
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
	
	
}
