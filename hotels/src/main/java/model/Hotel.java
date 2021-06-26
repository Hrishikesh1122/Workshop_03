/**
 * Purpose : POJO for Hotel
 * @author Hrishikesh
 * @version 1.0
 * @Since 26-06-2021
 * 
 *
 */
package model;
public class Hotel {
	
	public String hotelName ;
	public int ratings;
	public int weekendRate;
	public int weekdayRatesRegular;
	public int weekdayRatesLoyalty;
	public int weekEndRatesRegular;
	public int weekEndRatesLoyalty;
	

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", ratings=" + ratings + ", weekendRate=" + weekendRate
				+ ", weekdayRatesRegular=" + weekdayRatesRegular + ", weekdayRatesLoyalty=" + weekdayRatesLoyalty
				+ ", weekEndRatesRegular=" + weekEndRatesRegular + ", weekEndRatesLoyalty=" + weekEndRatesLoyalty + "]";
	}


	public int getWeekdayRatesRegular() {
		return weekdayRatesRegular;
	}


	public void setWeekdayRatesRegular(int weekdayRatesRegular) {
		this.weekdayRatesRegular = weekdayRatesRegular;
	}


	public int getWeekdayRatesLoyalty() {
		return weekdayRatesLoyalty;
	}


	public void setWeekdayRatesLoyalty(int weekdayRatesLoyalty) {
		this.weekdayRatesLoyalty = weekdayRatesLoyalty;
	}


	public int getWeekEndRatesRegular() {
		return weekEndRatesRegular;
	}


	public void setWeekEndRatesRegular(int weekEndRatesRegular) {
		this.weekEndRatesRegular = weekEndRatesRegular;
	}


	public int getWeekEndRatesLoyalty() {
		return weekEndRatesLoyalty;
	}


	public void setWeekEndRatesLoyalty(int weekEndRatesLoyalty) {
		this.weekEndRatesLoyalty = weekEndRatesLoyalty;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public int getRatings() {
		return ratings;
	}


	public void setRatings(int ratings) {
		this.ratings = ratings;
	}


	public int getWeekendRate() {
		return weekendRate;
	}


	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}
	
}
