/************************************************************
 * Purpose : Build Hotel reservation system
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package service;
import java.util.Scanner;
import model.Hotel;

public class ReservationSystem {
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * Enables user to enter hotel fields
	 * @return true if reservation successful
	 */
	public boolean addHotel() {
		Hotel hotel = new Hotel();
		System.out.println("Enter Hotel name");
		hotel.setHotelName(sc.next());
		System.out.println("Enter rates for weekend for regular customer");
		hotel.setWeekdayRatesRegular(sc.nextInt());
		System.out.println("Enter rates for weekend for loyalty customer");
		hotel.setWeekEndRatesLoyalty(sc.nextInt());
		System.out.println("Enter rates for weekday for regular customer");
		hotel.setWeekdayRatesRegular(sc.nextInt());
		System.out.println("Enter rates for weekday for loyalty customer");
		hotel.setWeekdayRatesLoyalty(sc.nextInt());
		return true;
	}

}
