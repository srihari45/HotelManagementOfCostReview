package hm.base.impl;

import java.util.Date;

import hm.base.HotelManage;

public class HotelY extends HotelManage {

	private String rating = "5";
	private String weekDayPriceForReg = "130";
	private String weekEndPriceForReg = "120";
	private String weekDayPriceForRew = "110";
	private String weekEndPriceForRew = "100";

	public HotelManage getHotelPrice(Date date, String customer) {
		HotelY hotelManage = new HotelY();
		if (customer.equalsIgnoreCase("REGULAR")) {
			if (isWeekDay(date)) {
				hotelManage.setFinalPrice(this.weekDayPriceForReg);
			} else {
				hotelManage.setFinalPrice(this.weekEndPriceForReg);
			}
		} else {
			if (isWeekDay(date)) {
				hotelManage.setFinalPrice(this.weekDayPriceForRew);
			} else {
				hotelManage.setFinalPrice(this.weekEndPriceForRew);
			}
		}
		hotelManage.setHotelRating(this.rating);
		return hotelManage;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getWeekDayPriceForReg() {
		return weekDayPriceForReg;
	}

	public void setWeekDayPriceForReg(String weekDayPriceForReg) {
		this.weekDayPriceForReg = weekDayPriceForReg;
	}

	public String getWeekEndPriceForReg() {
		return weekEndPriceForReg;
	}

	public void setWeekEndPriceForReg(String weekEndPriceForReg) {
		this.weekEndPriceForReg = weekEndPriceForReg;
	}

	public String getWeekDayPriceForRew() {
		return weekDayPriceForRew;
	}

	public void setWeekDayPriceForRew(String weekDayPriceForRew) {
		this.weekDayPriceForRew = weekDayPriceForRew;
	}

	public String getWeekEndPriceForRew() {
		return weekEndPriceForRew;
	}

	public void setWeekEndPriceForRew(String weekEndPriceForRew) {
		this.weekEndPriceForRew = weekEndPriceForRew;
	}

}
