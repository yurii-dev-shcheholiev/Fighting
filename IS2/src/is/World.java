package is;

import java.util.ArrayList;
import java.util.List;

public class World {
	
	//private Section[] sections;
	private String name;
	private int numFighters;
	private List<Fighter> fighters;
	
	public World(String name) {
		//initSections();
		fighters = new ArrayList<>();
		this.name = name;
		setNumFighters(0);
	}
	
	public void addFighter(Fighter a) {
		fighters.add(a);
		setNumFighters(getNumFighters() + 1);
	}
	
	public void deleteFighter(Fighter f) {
		fighters.remove(f);
		setNumFighters(getNumFighters() - 1);
	}
	
	public String stringify() {
		String str = "";
		
		str = name + "\n";
		for(int i = 0; i < fighters.size(); i++) {
			str += fighters.get(i).stringify() + "\n";
		}
		
		return str;
	}

	public int getNumFighters() {
		return numFighters;
	}

	public void setNumFighters(int numFighters) {
		this.numFighters = numFighters;
	}
	
	/*public void moveAgent(String exit_section, String in_section, int i) {
		try {
			Section out_section = getSection(exit_section);
			Section destSection = getSection(in_section);
			if(out_section == null) {
				throw new Exception("The section " + exit_section + " does not exist.");
			}
			else if (destSection == null) {
				throw new Exception("The destiny section " + in_section + " does not exist.");
			}
			Fighter aux = out_section.getAgent(i);
			
			out_section.deleteAgent(i);
			destSection.addAgent(aux);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
	}*/
	
	/*private void initSections(){
		sections = new Section[SIZE];
		for(int i = 0; i < SIZE; i++) {
			sections[i] = new Section("Section "+ (i+1));
		}	
	}*/
	
	/*public void addAgent(Fighter a, String topic) {
		for(int i = 0; i < SIZE; i++) {
			if(sections[i].getTopic().equalsIgnoreCase(topic)) {
				sections[i].addAgent(a);
			}
		}
	}*/
	
	
	/*public boolean contains(Fighter user, int i) {
		return sections[i].contains(user);
	}*/
	
	/*private Section getSection(String section) {
		
		Section aux = null;;
		for(int i = 0; i < SIZE; i++) {
			if (sections[i].getTopic().equalsIgnoreCase(section)) {
				aux = sections[i];
			}
		}
		
		return aux;
	}*/
	
	/*public String stringify() {
		String str = "Name: " + name + "\n" +
					"Sections: " + SIZE + "\n";
		for(int i = 0; i < SIZE; i++) {
			str += "	" + sections[i].stringify() + "\n";
		}
		
		return str;
	}*/
	
	
}
