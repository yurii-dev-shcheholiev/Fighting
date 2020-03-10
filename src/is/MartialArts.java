package is;

public enum MartialArts {
	NONE("None", 0),
	KARATE("Karate", 0),
	BOXING("Boxing", 0),
	KICKBOXING("Kickboxing", 0),
	WRESTLING("Wrestling", 0),
	SUMO("Sumo", 0),
	KUNGFU("Kung Fu", 0),
	AIKIDO("Aikido", 0),
	STREET("Street", 0),
	JUIJUTSU("Jujitsu", 0),
	KRAVMAGA("Krav Maga", 0),
	PANKRATION("Pankration", 0),
	NITEN("Niten", 0);
	
	private String name;
	private int type;
	
	private MartialArts(String name, int type) {
		this.name = name;
		this.type = type;
	}

	public static MartialArts parse(String inputString) {
		for (MartialArts style : MartialArts. values() )
			if (style . name().equalsIgnoreCase(inputString))
				return style;
		return null;
	}
}