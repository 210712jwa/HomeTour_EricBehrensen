package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;
	
	public void init() {
	    rooms = new Room[5];
		Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into a doorway." + "\n"
			+ "To the north is a small room, where you can see a couch." + "\n"
			+ "To the east is the exit.");
	    Room diningRoom = new Room("The Dining Room", 
	    		"a small dining room", 
	    		"A kitchen is open to the west, where a fridge can be seen." + "\n"
	    		+ "To the north is the Foyer.");
	    Room kitchen = new Room("The Kitchen", 
	    		"a kitchen", 
	    		"There is a fridge." + "\n" 
	    		+ "To the east is the Dining Room.");
	    Room bedRoom = new Room("The Bedroom", 
	    		"a bedroom", 
	    		"There is a bed." + "\n"
	    		+ "To the east is a doorway.");
	    Room livingRoom = new Room("The Living Room",
	    		"a living room",
	    		"There is a couch." + "\n"
	    		+ "To the south is the Foyer.");
	    rooms[0] = foyer;
	    foyer.setExits(diningRoom, bedRoom, livingRoom, null);
	    rooms[1] = diningRoom;
	    diningRoom.setExits(null, kitchen, foyer, null);
	    rooms[2] = kitchen;
	    kitchen.setExits(null, null, null, diningRoom);
	    rooms[3] = bedRoom;
	    bedRoom.setExits(null, null, null, foyer);
	    rooms[4] = livingRoom;
	    livingRoom.setExits(foyer, null, null, null);
	    startingRoom = foyer;
	}
	
	public Room getRoom(int index) {
		return rooms[index];
	}
}
