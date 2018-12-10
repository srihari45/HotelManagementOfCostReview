package hm.base;

import java.util.Calendar;
import java.util.Date;

public class HotelManage {
	
	private String finalPrice;
	private String hotelRating;

	public static String[] weekdaysArr = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNSDAY", "THURSDAY", "FRIDAY",
			"SATURDAY" };

	public static boolean isWeekDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		if (day == 1 || day == 7) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isWeekDay(new Date()));
	}

	public String getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(String finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}
}
