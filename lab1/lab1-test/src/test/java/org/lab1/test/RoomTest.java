package org.lab1.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.lab1.code.Room;

public class RoomTest {
	@Test
	public void aNewRoomIsNotAvaiable() {
		Room room = new Room();
		assertFalse(room.isAvailable());
	}
}