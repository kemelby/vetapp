package vetApp;

import java.util.*;

public class WaitingRoomQueue {
	
	Queue<String> waitingRoom = new LinkedList<>();
	
	public void addToQueue(String addThis) {
		waitingRoom.add(addThis);
	}
	
	public void rmFromQueue() {
		waitingRoom.remove();
	}
	
	public String viewTopQ() {
		if(waitingRoom.isEmpty()) {
			return "The Waiting Room is Empty";
		}
		else {
			return waitingRoom.element();
		}
	}
	
}
