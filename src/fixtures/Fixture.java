package fixtures;

public abstract class Fixture {
	private String name;
	private String shortDescription;
	private String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		return name + "\n" + shortDescription + "\n" + longDescription;
	}
	
	public String getName() {
		return name;
	}
}
