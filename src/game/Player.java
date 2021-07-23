package game;

import fixtures.Room;

public class Player {
	private Room currentRoom;
	private RoomManager roomManager = new RoomManager();
	
	public Player() {		
		roomManager.init();
		currentRoom = roomManager.getRoom(0);
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public RoomManager getRoomManager() {
		return roomManager;
	}
}
