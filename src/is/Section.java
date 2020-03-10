package is;

public class Section {

	private Fighter[] agents;
	private String topic;
	private int total_users;
	private static final int SIZE = 100;
	
	public Section(String topic) {
		agents = new Fighter[SIZE];
		this.topic = topic;
		total_users = 0;
	}
	
	
	public Fighter getAgent(int i) {
		return this.agents[i];
	}
	
	public void deleteAgent(int i) {
		for(int j = i; j < total_users; j++) {
			agents[j] = agents[j+1];
		}
		agents[total_users] = null;
		total_users--;
	}
	
	public void addAgent(Fighter user) {
		try {
			if(total_users == SIZE) {
				throw new Exception("Full List!!");
			}
			else {
				agents[total_users] = user;
				total_users++;
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public String getTopic() {
		return topic;
	}
	
	public String stringify() {
	
		String str = topic + "\n";
		if(total_users > 0) {
			str += "Agents: \n";	
			for(int i = 0; i < total_users; i++) {
				str +=  agents[i].stringify();
			}
		}
		else {
			str += "No users in this section.";
		}
		
		return str;
	}
	
	public boolean contains(Fighter user) {
		boolean found = false;
		int i = 0;
		
		while(!found && i < total_users) {
			if(agents[i] == user) {
				found = true;
			}
			else {
				i++;
			}
		}
		
		
		return found;
	}
	
}
