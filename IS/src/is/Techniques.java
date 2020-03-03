package is;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public enum Techniques {
	PUNCH(MartialArts.NONE, "Normal punch", 40, 0, 100, 30, 50, 40),
	KICK(MartialArts.NONE, "Normal punch", 90, 0, 100, 50, 50, 20),
	SEIKEN(MartialArts.NONE, "Normal punch", 10, 0, 10, 20, 50, 40),
	JAB(MartialArts.NONE, "Normal punch", 10, 0, 10, 20, 50, 40),
	GRAB(MartialArts.NONE, "Normal punch", 10, 0, 10, 20, 50, 40),
	EVASION(MartialArts.NONE, "Normal punch", 10, 0, 10, 20, 50, 40);
	
	private List<MartialArts> disciplines;
	private String description;
	private int damage;
	private int effect;
	private int accuracy;
	private int speed;
	private int stability;
	private int range;
	// anadir coste de stamina como atributo
	
	// meter excepciones (mas tarde)
	private Techniques(MartialArts discipline,  String description, int damage, int effect, int accuracy, int speed, int stability, int range)
	{
		this.disciplines = new ArrayList<>();
		disciplines.add(discipline);
		this.description = description;
		this.damage = damage;
		this.effect = effect;
		this.accuracy = accuracy;
		this.speed = speed;
		this.stability = stability;
		this.range = range;
	}
	private Techniques(MartialArts discipline1, MartialArts discipline2,  String description, int damage, int effect, int accuracy, int speed, int stability, int range)
	{
		this.disciplines = new ArrayList<>();
		disciplines.add(discipline1);
		disciplines.add(discipline2);
		this.description = description;
		this.damage = damage;
		this.effect = effect;
		this.accuracy = accuracy;
		this.speed = speed;
		this.stability = stability;
		this.range = range;
	}
	private Techniques(MartialArts discipline1, MartialArts discipline2, MartialArts discipline3, String description, int damage, int effect, int accuracy, int speed, int stability, int range)
	{
		this.disciplines = new ArrayList<>();
		disciplines.add(discipline1);
		disciplines.add(discipline2);
		disciplines.add(discipline3);
		this.description = description;
		this.damage = damage;
		this.effect = effect;
		this.accuracy = accuracy;
		this.speed = speed;
		this.stability = stability;
		this.range = range;
	}
	public List<MartialArts> getDisciplines() {
		return Collections.unmodifiableList(disciplines);
	}
	public String getDescription() {
		return description;
	}
	public int getDamage() {
		return damage;
	}
	public int getEffect() {
		return effect;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public int getSpeed() {
		return speed;
	}
	public int getStability() {
		return stability;
	}
	public int getRange() {
		return range;
	}
	public String stringify() {
		String s = this.name() + ": \n" +
					description + "\n" +
					"Damage: " + damage + "\n" +
					"Effect: " + effect + "\n" +
					"Speed: " + speed + "\n" +
					"Stability: " + range+ "\n";
		return s;
	}
}
