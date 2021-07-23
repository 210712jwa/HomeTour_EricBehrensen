package fixtures;

public class Room extends Fixture {
	private Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	public void setExits(Room... exits) {
		this.exits = exits;
	}
}
