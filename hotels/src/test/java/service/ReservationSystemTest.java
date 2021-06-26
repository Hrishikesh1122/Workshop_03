package service;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class ReservationSystemTest {
	ReservationSystem reservation = new ReservationSystem();

	@Test
	public void givenHotelAddition_IfSuccesful_ShouldReturnStringMessege() {
		String result = reservation.addHotel();
		Assert.assertEquals("Hotel added", result);
	
	}

}
