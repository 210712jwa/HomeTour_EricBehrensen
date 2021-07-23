package game;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static boolean exit;

	public static void main(String[] args) {
		Player player = new Player();
		exit = true;
		
		while(exit) {
			printRoom(player);
			parse(collectInput(), player);
		}
		
		System.out.println("The tour is over.  Have a nice day.");
	}
	
	public static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().toString());
	}
	
	public static String[] collectInput() {
		String collectedInput = sc.nextLine();
		String[] parsedInput = collectedInput.split(" ");
		
		return parsedInput;
	}
	
	public static void parse(String[] command, Player player) {
		switch(command[0]) {
			case "go": if(player.getCurrentRoom().getName().equals("The Foyer")) {
				switch(command[1]) {
					case "south": player.setCurrentRoom(player.getRoomManager().getRoom(1));
					break;
					case "west": player.setCurrentRoom(player.getRoomManager().getRoom(3));
					break;
					case "north": player.setCurrentRoom(player.getRoomManager().getRoom(4));
					break;
					case "east": exit = false;
					break;
					default: System.out.println("Invalid input.  Please try again.");
				}
			} else if(player.getCurrentRoom().getName().equals("The Dining Room")) {
				switch(command[1]) {
					case "west": player.setCurrentRoom(player.getRoomManager().getRoom(2));
					break;
					case "north": player.setCurrentRoom(player.getRoomManager().getRoom(0));
					break; 
					default: System.out.println("Invalid input.  Please try again.");
				}
			} else if(player.getCurrentRoom().getName().equals("The Kitchen")) {
				switch(command[1]) {
					case "east": player.setCurrentRoom(player.getRoomManager().getRoom(1));
					break;
					default: System.out.println("Invalid input.  Please try again.");
				}
			} else if(player.getCurrentRoom().getName().equals("The Bedroom")) {
				switch(command[1]) {
					case "east": player.setCurrentRoom(player.getRoomManager().getRoom(0));
					break;
					default: System.out.println("Invalid input.  Please try again.");
				}
			} else if(player.getCurrentRoom().getName().equals("The Living Room")) {
				switch(command[1]) {
					case "south": player.setCurrentRoom(player.getRoomManager().getRoom(0));
					break; 
					default: System.out.println("Invalid input.  Please try again.");
				}
			}
			break;
			case "open": if(command[1].equals("fridge")) System.out.println("You see food and close the fridge.");
			else System.out.println("There is nothing to open.");
			break;
			case "sit": if(command[command.length - 1].equals("couch"))  System.out.println("You sit on the couch.  You get back up because it's uncomfortable.");
			else System.out.println("Nowhere to sit.");
			break;
			default: System.out.println("Invalid input.  Please try again.");
		}
	}

}
